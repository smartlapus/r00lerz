package com.r00lerz.businessRuleGenerator.domain.codeGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.inject.Injector;
import com.r00lerz.ruleDef.RuleDefException;
import com.r00lerz.ruleDef.generator.Main;

public class PLSQL_Generator implements CodeGenerator {

	private String srcGenPath;
	Injector injector;
	Main generator;

	public PLSQL_Generator() {
		this.injector = new com.r00lerz.ruleDef.RuleDefStandaloneSetup().createInjectorAndDoEMFRegistration();
		this.generator = injector.getInstance(Main.class);
	}

	@Override
	public synchronized Map<String, String> generateRule(String rule, String realPath) throws RuleDefException {
		this.srcGenPath = realPath + "src-gen" + File.separator;
		this.prepareInputFile(rule);
		generator.runGenerator(srcGenPath);

		return this.readCompilerOutput();
	}

	@Override
	public synchronized String generateRuleSet(String ruleSet, String realPath) throws RuleDefException {
		this.srcGenPath = realPath + "src-gen" + File.separator;
		this.prepareInputFile(ruleSet);
		generator.runGenerator(srcGenPath);

		return this.readCompilerOutput().get("generatedCode");
	}

	private Map<String, String> readCompilerOutput() {
		Map<String, String> result = new HashMap<String, String>();
		String generatedCode = "";
		String ruleType = "";

		generatedCode = PLSQL_Generator.readFile(srcGenPath + "generatedcode.sql", Charset.defaultCharset());
		ruleType = PLSQL_Generator.readFile(srcGenPath + "ruletype.txt", Charset.defaultCharset());
		this.removeFiles();

		result.put("generatedCode", generatedCode);
		result.put("ruleType", ruleType);

		return result;
	}

	static String readFile(String path, Charset encoding) {
		try {
			if (new File(path).exists()) {
				byte[] encoded = Files.readAllBytes(Paths.get(path));
				return encoding.decode(ByteBuffer.wrap(encoded)).toString();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void prepareInputFile(String rule) {
		if (!new File(srcGenPath).isDirectory()) {
			boolean success = (new File(srcGenPath).mkdirs());
		}
		try {
			File file = new File(srcGenPath + "input.rdef");
			PrintWriter out = new PrintWriter(file);
			out.println(rule);
			out.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	private void removeFiles() {
		new File(srcGenPath + "generatedcode.sql").delete();
		new File(srcGenPath + "ruletype.txt").delete();
		new File(srcGenPath + "input.rdef").delete();
	}
}