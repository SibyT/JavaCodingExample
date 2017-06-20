package org.java.arr;

import java.util.Arrays;

/**
 * Given an array consists of non-negative integers, your task is to count the
 * number of triplets chosen from the array that can make triangles if we take
 * them as side lengths of a triangle
 * 
 * @author SibyThomas
 *
 */
public class TriangleNumber {
	/*
	 * Input: [2,2,3,4] Output: 3 Explanation: Valid combinations are: 2,3,4
	 * (using the first 2) 2,3,4 (using the second 2) 2,2,3
	 */
	public static int triangleNumber(int[] nums) {
		int count = 0;
		if (nums.length < 3)
			return count;
		Arrays.sort(nums);
		int n = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0)
				n++;
		}
		int[] newArray = new int[n];
		int l = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				newArray[l] = nums[i];
				l++;
			}
		}
		for (int i = 0; i < newArray.length - 2; ++i) {
			// If triplet satisfies triangle
			// condition, break
			int k = i + 2;
			for (int j = i + 1; j < newArray.length; ++j) {
				while (k < newArray.length && newArray[i] + newArray[j] > newArray[k]) {
					++k;

					count += k - j - 1;
				}
			}
		}

		return count;

	}

	public static void main(String[] args) {
		System.out.println(triangleNumber(new int[] { 82, 15, 23, 82, 67, 0, 3, 92, 11 }));
	}
}
