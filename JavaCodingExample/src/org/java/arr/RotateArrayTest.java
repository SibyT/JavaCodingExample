package org.java.arr;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RotateArrayTest {

	private static RotateArray ra;

	@BeforeClass
	public static void before() {
		ra = new RotateArray();
	}

	@AfterClass
	public static void after() {
		ra = null;
	}

	@Test
	public void testRotate() {
		int[] expecteds = new int[] { 5, 6, 7, 1, 2, 3, 4 };
		int[] actuals = ra.rotateArray(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testRotate1() {
		int[] expecteds = new int[] { 1 };
		int[] actuals = ra.rotateArray(new int[] { 1 }, 0);
		assertArrayEquals(expecteds, actuals);
	}

	@Test(expected = ArithmeticException.class)
	public void testRotateException() {
		ra.rotateArray(new int[] {}, 3);
		fail("Expected Arithmetic exception");
	}

}
