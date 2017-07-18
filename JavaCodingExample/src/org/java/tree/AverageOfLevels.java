package org.java.tree;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevels {
	/**
	 * Given a non-empty binary tree, return the average value of the nodes on
	 * each level in the form of an array.
	 * Input:
		    3
		   / \
		  9  20
		    /  \
		   15   7
		Output: [3, 14.5, 11]
		Explanation:
		The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
	 * 
	 * @param root
	 * @return
	 */
	public List<Double> averageOfLevels(TreeNode root) {
		int levels = findLevels(root, 0);
		int[] nodeCount = new int[levels];
		long[] valCount = new long[levels];

		traverse(root, 0, nodeCount, valCount);

		List<Double> avg = new ArrayList<>();
		for (int i = 0; i < levels; i++) {
			avg.add(((double) valCount[i]) / nodeCount[i]);
		}
		return avg;
	}

	private void traverse(TreeNode node, int level, int[] nodeCount, long[] valCount) {
		if (node == null) {
			return;
		}

		nodeCount[level]++;
		valCount[level] += node.val;
		traverse(node.left, level + 1, nodeCount, valCount);
		traverse(node.right, level + 1, nodeCount, valCount);
	}

	private int findLevels(TreeNode node, int level) {
		if (node == null) {
			return level;
		}

		return Math.max(findLevels(node.left, level + 1), findLevels(node.right, level + 1));
	}
}
