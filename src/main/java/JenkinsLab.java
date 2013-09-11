/**
 * 
 */
package main.java;

import main.java.helpers.TextBuilder;
import main.java.utils.Calculadora;

/**
 * @author voliveira
 *
 */
public class JenkinsLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int valor = calc.soma(1, 3);
		
		TextBuilder textBuilder = new TextBuilder();	
		String fullName = textBuilder.join("Vitor", "Oliveira");
		
		System.out.println ("Hello " + fullName + " => " + String.valueOf(valor));
	}
}
