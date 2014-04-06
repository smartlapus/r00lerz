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

import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;
import com.r00lerz.ruleDef.RuleDefException;
import com.r00lerz.ruleDef.generator.Main;

public class PLSQL_Generator implements CodeGenerator {

	private String srcGenPath;
	Injector injector;
	Main generator;

	public PLSQL_Generator(){
		this.injector = new com.r00lerz.ruleDef.RuleDefStandaloneSetup().createInjectorAndDoEMFRegistration();
		this.generator = injector.getInstance(Main.class);
	}
	
	@Override
	public Map<String, String> generateRule(String rule, String realPath) {
		this.srcGenPath = realPath+"src-gen"+File.separator;
		
		String generatedCode = "";
		String ruleType = "";
		Map<String,String> result = new HashMap<String, String>();
		
		this.prepareInputFile(rule);
		
		try {
			generator.runGenerator(srcGenPath);
		} catch (RuleDefException e1) {
			e1.printStackTrace();
		}
		try {
			generatedCode = PLSQL_Generator.readFile(srcGenPath+"generatedcode.sql",Charset.defaultCharset());
			ruleType = PLSQL_Generator.readFile(srcGenPath+"ruletype.txt",Charset.defaultCharset());
			this.removeFiles();
		} catch (IOException e) {
			e.printStackTrace();
		}
		result.put("generatedCode", generatedCode);
		result.put("ruleType", ruleType);			
		return result;
	}

	@Override
	public String generateRuleSet(String ruleSet) {
		return null;
	}

	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return encoding.decode(ByteBuffer.wrap(encoded)).toString();
	}
	
	private void prepareInputFile(String rule){
		if (!new File(srcGenPath).isDirectory()) {
			System.out.println("PLSQL_Generator.generateRule::dir not found");
			boolean success = (new File(srcGenPath).mkdirs());
			if (!success) {
			    System.out.println("PLSQL_Generator.generateRule::failed too create directory");
			}
			else{
				System.out.println("PLSQL_Generator.generateRule::directory created");
			}
		}
		try {
			File file = new File(srcGenPath+"input.rdef");
			PrintWriter out = new PrintWriter(file);
			out.println(rule);
			out.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	private void removeFiles(){
		new File(srcGenPath+"generatedcode.sql").delete();
		new File(srcGenPath+"ruletype.txt").delete();
		new File(srcGenPath+"input.rdef").delete();
	}

	public static void main(String[] args) {
		CodeGenerator cg = new PLSQL_Generator();
		Map m = cg.generateRule("person must be bigger than 1000", "");
		System.out.println("generated business rule: " + m);
	}
}