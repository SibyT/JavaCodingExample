package org.java.arr;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? You may assume the
 * returned list does not count as extra space.
 * 
 * @author SibyThomas
 *
 */
public class FindDisappearedNumbers {

	public FindDisappearedNumbers() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Input: [4,3,2,7,8,2,3,1]
	 * 
	 * Output: [5,6]
	 * 
	 * @param nums
	 * @return
	 */
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int count[] = new int[nums.length + 2];
		List<Integer> ret = new ArrayList<Integer>();
		int i;

		for (i = 0; i < nums.length; i++) {
			count[nums[i]] = 1;
		}

		for (i = 1; i <= nums.length; i++) {
			if (count[i] == 0) {
				ret.add(i);
			}
		}

		return ret;

	}

}
