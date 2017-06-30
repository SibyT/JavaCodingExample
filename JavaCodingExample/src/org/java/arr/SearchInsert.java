package org.java.arr;

/**
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples. [1,3,5,6], 5 >> 2 [1,3,5,6], 2 >> 1 [1,3,5,6], 7 >> 4
 * 
 * @author SibyThomas
 *
 */
public class SearchInsert {

	public int SearchInsert(int[] nums, int target) {
		if (nums.length == 0)
			return 0;

		int low = 0;
		int high = nums.length;
		int mid = high / 2;
		while (high - low > 0) {
			if (target == nums[mid])
				return mid;
			if (target > nums[mid]) {
				low = mid + 1;
				mid = low + (high - low) / 2;
			} else {
				high = mid - 1;
				mid = high - (high - low) / 2;
			}
		}
		if (mid < 0 || (mid < nums.length && target > nums[mid]))
			return mid + 1;
		else
			return mid;
	}

}
