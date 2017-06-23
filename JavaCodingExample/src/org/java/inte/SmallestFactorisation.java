package org.java.inte;

/**
 * Given a positive integer a, find the smallest positive integer b whose
 * multiplication of each digit equals to a.
 * 
 * If there is no answer or the answer is not fit in 32-bit signed integer, then
 * return 0.
 * 
 * @author SibyThomas
 *
 */
public class SmallestFactorisation {
	/**
	 * Input 48 output 68, Input 15 output 35
	 * @param a
	 * @return
	 */
	public static int smallestFactorization(int a) {
		if (a < 2)
			return a;
		long res = 0, mul = 1;
		for (int i = 9; i >= 2; i--) {
			while (a % i == 0) {
				a /= i;
				res = mul * i + res;
				mul *= 10;
			}
		}
		return a < 2 && res <= Integer.MAX_VALUE ? (int) res : 0;
	}

}
