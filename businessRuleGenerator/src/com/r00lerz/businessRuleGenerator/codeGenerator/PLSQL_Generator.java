package com.r00lerz.businessRuleGenerator.codeGenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PLSQL_Generator implements CodeGenerator{

	@Override
	public String generateRule(String rule) {
		String s = startCodeGenerator(rule);
		return s;
	}

	@Override
	public String generateRuleSet(String ruleSet) {

		return null;
	}

	public String startCodeGenerator(String rule){
		try {
			PrintWriter out = new PrintWriter("lib/input.rdef");
			out.println(rule);
			out.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

			Process proc;
			try 
			{
				proc = Runtime.getRuntime().exec("java -jar lib/ruleDefLang.jar lib/input.rdef");
				InputStream in = proc.getInputStream();
				InputStream err = proc.getErrorStream();
				InputStreamReader isr = new InputStreamReader(err);
				BufferedReader br = new BufferedReader(isr);
				String line = null;
				System.out.println("<ERROR>");
				while ( (line = br.readLine()) != null)
					System.out.println(line);
				System.out.println("</ERROR>");
				int exitVal = proc.waitFor();
				System.out.println("Process exitValue: " + exitVal);
				in.close();
				err.close();
			} catch (Throwable t) {
				t.printStackTrace();
			}

			String result = "";

			try {
				result = PLSQL_Generator.readFile("src-gen/generatedcode.sql", Charset.defaultCharset());
			} catch (IOException e) {
				// 
				e.printStackTrace();
			}
			return result;
		}

		static String readFile(String path, Charset encoding) 
				throws IOException 
				{
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			return encoding.decode(ByteBuffer.wrap(encoded)).toString();
				}

		public static void main(String[ ] args){
			CodeGenerator cg = new PLSQL_Generator();
			String s = cg.generateRule("domein.model bigger than 1000");
			System.out.println("generated business rule: " + s);
		}


	}
