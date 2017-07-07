package org.java.tree;

/**
 * Given two binary trees and imagine that when you put one of them to cover the
 * other, some nodes of the two trees are overlapped while the others are not.
 * 
 * You need to merge them into a new binary tree. The merge rule is that if two
 * nodes overlap, then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of new tree.
 * Input: 
 * Tree 1                     Tree 2                  
 *          1                         2                             
 *         / \                       / \                            
 *        3   2                     1   3                        
 *       /                           \   \                      
 *      5                             4   7                  
 * Output: 
 * Merged tree:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \ 
 * 	 5   4   7
 * @author SibyThomas
 *
 */
public class MergeTree {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * } 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;

		TreeNode left = mergeTrees(t1.left, t2.left);
		TreeNode right = mergeTrees(t1.right, t2.right);

		t1.val += t2.val;
		t1.left = left;
		t1.right = right;
		return t1;
	}

}
