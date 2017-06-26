package org.java.arr;

import java.util.Arrays;

/**
 * Given an integer array, find three numbers whose product is maximum and
 * output the maximum product.
 * 
 * @author SibyThomas
 *
 */
public class MaximumProduct {
	/**
	 * Input: [1,2,3] Output: 6 Input: [1,2,3,4] Output: 24
	 * 
	 * @param nums
	 * @return
	 */
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
	}
}
