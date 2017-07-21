package org.java.str;

import java.util.Arrays;

/**
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 * @author SibyThomas
 *
 */
public class IsAnagram {

	public IsAnagram() {
		// TODO Auto-generated constructor stub
	}

	public static boolean IsAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		char[] chars1 = t.toCharArray();
		Arrays.sort(chars1);
		String charsS = new String(chars);
		String charsT = new String(chars1);

		return charsS.equalsIgnoreCase(charsT);

	}

}
