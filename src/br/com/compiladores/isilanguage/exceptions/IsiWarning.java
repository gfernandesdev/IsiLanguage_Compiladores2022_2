package br.com.compiladores.isilanguage.exceptions;

//Java program to demonstrate
//Logger.warning(String msg) method

import java.io.IOException;
import java.util.logging.*;

public class IsiWarning {
	 public IsiWarning (String msg){
	
	     // Create a Logger
		 Logger logger
	         = Logger.getLogger(
	        		 IsiWarning.class.getName());
	
	     // Set Logger level()
	     logger.setLevel(Level.WARNING);
	
	     // Call warning method
	     logger.warning(msg);
	 }
}
