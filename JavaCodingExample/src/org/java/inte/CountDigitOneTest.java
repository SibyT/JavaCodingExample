package org.java.inte;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CountDigitOneTest {
	private static CountDigitOne s = new CountDigitOne();

	@Parameters
	public static Collection<Integer[]> testconditions() {
		return Arrays.asList(new Integer[][] { { 13, 6 }, { 10, 2 }, { 0, 0 }, { 11, 4 } });
	}

	private int actual;
	private int expected;

	public CountDigitOneTest(int actual, int expected) {
		this.actual = actual;
		this.expected = expected;
	}

	@Test
	public void test() {
		assertEquals(expected, s.countDigitOne(actual));
	}

}
