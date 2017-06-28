package org.java.inte;

/**
 * Validate if a given string is numeric.
 * 
 * @author SibyThomas
 *
 */
public class isNumber {
	/**
	 * Some examples: "0" => true " 0.1 " => true "abc" => false "1 a" => false
	 * "2e10" => true
	 * 
	 * @param s
	 * @return
	 * @return
	 */
	public boolean isNumber(String s) {

		return s.matches("(\\s*)[+-]?((\\.[0-9]+)|([0-9]+(\\.[0-9]*)?))(e[+-]?[0-9]+)?(\\s*)");
	}

}
