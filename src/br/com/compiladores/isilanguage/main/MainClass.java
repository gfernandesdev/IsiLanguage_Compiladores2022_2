package br.com.compiladores.isilanguage.main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import br.com.compiladores.isilanguage.parser.IsiLangLexer;
import br.com.compiladores.isilanguage.parser.IsiLangParser;

public class MainClass {
	public static void main(String[] args) {
		try {
			IsiLangLexer lexer;
			IsiLangParser parser;
			
			// lendo arquivo input.isi que é entrada para o analisador lexico
			lexer = new IsiLangLexer(CharStreams.fromFileName("input.isi"));
			
			// cria um fluxo de tokens para passar para o parser
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// crio o parser a partir desse tokenStream
			parser = new IsiLangParser(tokenStream);
			
			parser.prog();
			
			System.out.println("Compilado");
		}
		catch(Exception ex) {
			System.err.println("ERROR "+ex.getMessage());
		}
	}

}
