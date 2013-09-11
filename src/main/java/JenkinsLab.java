/**
 * 
 */
package main.java;

import main.java.utils.*;

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
		System.out.println ("Hello World. Resultado: " + String.valueOf(valor));
	}
}
