package org.java.inte;

/**
 * Given a positive integer num, write a function which returns True if num is a
 * perfect square else False. Note: Do not use any built-in library function
 * such as sqrt.
 * 
 * @author SibyThomas
 *
 */
public class IsPerfectSquare {
	public boolean isPerfectSquare(int num) {
		boolean answer = false;
		if (num == 1) {
			return true;
		}
		for (int i = 0; i <= num / 2; i++) {
			if (i * i == num) {
				return true;
			}

		}
		return answer;
	}
}
