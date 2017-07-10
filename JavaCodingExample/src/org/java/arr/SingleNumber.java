package org.java.arr;

/**
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * 
 * @author SibyThomas
 *
 */
public class SingleNumber {

	public SingleNumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums) {
		int n = nums[0];
		for (int i = 1; i < nums.length; i++)
			n ^= nums[i];
		return n;
	}
}
