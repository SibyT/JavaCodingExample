package org.java.arr;
/*
 * Rotate an array of n elements to the right by k steps.

 */
public class RotateArray {
	/*
	 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
	 */
	public int [] rotateArray(int[] nums, int k) {
		k = k % nums.length;
		swap(nums, 0, nums.length - k - 1);
		swap(nums, nums.length - k, nums.length - 1);

		swap(nums, 0, nums.length - 1);
		return nums;
	}
	/*
	 * Swapping each elements of array
	 */
	void swap(int[] nums, int start, int end) {
		int temp;
		for (int i = start; i <= end; i++, end--) {
			temp = nums[i];
			nums[i] = nums[end];
			nums[end] = temp;

		}
	}
}
