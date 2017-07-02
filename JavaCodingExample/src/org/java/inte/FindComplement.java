package org.java.inte;

/**
 * Given a positive integer, output its complement number. The complement
 * strategy is to flip the bits of its binary representation.
 * 
 * Note: The given integer is guaranteed to fit within the range of a 32-bit
 * signed integer. You could assume no leading zero bit in the integer’s binary
 * representation.
 * 
 * @author SibyThomas
 *
 */
public class FindComplement {

	/**
	 * Input: 5 Output: 2 Explanation: The binary representation of 5 is 101 (no
	 * leading zero bits), and its complement is 010. So you need to output 2.
	 * Input: 1 Output: 0 Explanation: The binary representation of 1 is 1 (no
	 * leading zero bits), and its complement is 0. So you need to output 0.
	 * 
	 * @param num
	 * @return
	 */
	public int findComplement(int num) {
		int n = num;
		int all = 1;
		while (n > 1) {
			n >>= 1;
			all = (all << 1) | 1;
		}
		return num ^ all;
	}
}
