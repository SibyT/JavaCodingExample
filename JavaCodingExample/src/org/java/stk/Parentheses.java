package org.java.stk;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * @author SibyThomas
 *
 */
public class Parentheses {
	public boolean isValid(String s) {
		if (s.length() < 2)
			return false;
		Stack<Character> stack = new Stack<>();
		for (char cha : s.toCharArray()) {
			switch (cha) {
			case '(':
				stack.push(')');
				break;
			case '[':
				stack.push(']');
				break;
			case '{':
				stack.push('}');
				break;
			default:
				if (stack.isEmpty() || stack.pop() != cha) {
					return false;
				}
				break;
			}
		}
		return stack.isEmpty();
	}
}
