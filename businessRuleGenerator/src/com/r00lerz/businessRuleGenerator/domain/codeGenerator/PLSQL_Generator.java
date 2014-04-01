package com.r00lerz.businessRuleGenerator.domain.codeGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.inject.Injector;
import com.r00lerz.ruleDef.generator.Main;

public class PLSQL_Generator implements CodeGenerator {

	@Override
	public String generateRule(String rule, String realPath) {
		Injector injector = new com.r00lerz.ruleDef.RuleDefStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main generator = injector.getInstance(Main.class);
		
		System.out.println("PLSQL_Generator.generateRule::GENERATING: " + rule);
		
		try {
			if (!new File(realPath+"src-gen").isDirectory()) {
				System.out.println("PLSQL_Generator.generateRule::dir not found");
				boolean success = (new File(realPath+"src-gen").mkdirs());
				if (!success) {
				    System.out.println("PLSQL_Generator.generateRule::failed too create directory");
				}
				else{
					System.out.println("PLSQL_Generator.generateRule::directory created");
				}
				
			}
			File file = new File(realPath+"src-gen/input.rdef");
			PrintWriter out = new PrintWriter(file);
			out.println(rule);
			out.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
//		Process proc;
//		try {
//			proc = Runtime.getRuntime().exec(
//					"java -jar \"" + realPath + "WEB-INF/lib/ruleDefLang.jar\" " + realPath+"src-gen/input.rdef " + realPath);
//			InputStream in = proc.getInputStream();
//			InputStream err = proc.getErrorStream();
//			InputStreamReader isr = new InputStreamReader(err);
//			BufferedReader br = new BufferedReader(isr);
//			String line = null;
//			System.out.println("<ERROR OUTPUT>");
//			while ((line = br.readLine()) != null)
//				System.out.println(line);
//			System.out.println("</ERROR OUTPUT>");
//			int exitVal = proc.waitFor();
//			in.close();
//			err.close();
//		} catch (Throwable t) {
//			t.printStackTrace();
//		}
		String inputPath = realPath + "src-gen/input.rdef";
		String outputPath = realPath;
		generator.runGenerator(inputPath, outputPath);

		String result = "";

		try {
			result = PLSQL_Generator.readFile(realPath + "src-gen/generatedcode.sql",
					Charset.defaultCharset());
		} catch (IOException e) {
			//
			e.printStackTrace();
		}
		
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

	public static void main(String[] args) {
		CodeGenerator cg = new PLSQL_Generator();
		String s = cg.generateRule("domein.model must be bigger than 1000", "");
		System.out.println("generated business rule: " + s);
	}
}
