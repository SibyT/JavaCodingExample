package org.java.inte;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsPerfectSquareTest {
	private static IsPerfectSquare s = new IsPerfectSquare();

	@Test
	public void test() {
		assertTrue(s.isPerfectSquare(16));
		assertTrue(s.isPerfectSquare(25));
		assertTrue(s.isPerfectSquare(36));

	}

}
