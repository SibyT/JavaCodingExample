package org.java.arr;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given a circular array (the next element of the last element is the first
 * element of the array), print the Next Greater Number for every element. The
 * Next Greater Number of a number x is the first greater number to its
 * traversing-order next in the array, which means you could search circularly
 * to find its next greater number. If it doesn't exist, output -1 for this
 * number.
 * 
 * @author SibyThomas
 *
 */
public class NextGreaterElement {
	/**
	 * Input: [1,2,1] Output: [2,-1,2] Explanation: The first 1's next greater
	 * number is 2; The number 2 can't find next greater number; The second 1's
	 * next greater number needs to search circularly, which is also 2.
	 * 
	 * @param nums
	 * @return
	 */
	public int[] nextGreaterElements(int[] nums) {
		int size = nums.length;
		int next[] = new int[size];
		Arrays.fill(next, -1);
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < 2 * size; i++) {
			while (!stack.isEmpty() && nums[stack.peek()] < nums[i % size])
				next[stack.pop()] = nums[i % size];
			if (i < size)
				stack.push(i);
			if (stack.isEmpty())
				break; // break if stack is empty
		}
		return next;
	}

}
