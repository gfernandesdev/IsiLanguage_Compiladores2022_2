package br.com.compiladores.isilanguage.ast;

import java.util.ArrayList;

public class CommandLaco extends AbstractCommand {
	private String condition;
	private ArrayList<AbstractCommand> lista;
	
	public CommandLaco(String condition, ArrayList<AbstractCommand> lista) {
		this.condition = condition;
		this.lista = lista;
	}
	
	@Override
	public String generateJavaCode() {
		
		StringBuilder str = new StringBuilder();
		str.append("while ("+condition+") {\n");
		for (AbstractCommand cmd: lista) {
			str.append(cmd.generateJavaCode()+"\n");
		}
		str.append("}");
		return str.toString();
	}
	
	@Override
	public String toString() {
		return "CommandLaco [condition=" + condition + ", lista=" + lista + "]";
	}
}
