package org.java.str;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class DeleteElementEditDistTest {
	private static DeleteElementEditDist s = new DeleteElementEditDist();;
	private String word1;
	private String word2;
	private int expected;

	@Parameters
	public static Collection<Object[]> testconditions() {
		return Arrays.asList(
				new Object[][] { { "sea", "eat", 2 }, { "", "eat", 3 }, { "", "", 0 }, { "tested", "tested", 0 } });
	}

	public DeleteElementEditDistTest(String word1, String word2, int expected) {
		this.word1 = word1;
		this.word2 = word2;
		this.expected = expected;
	}

	@AfterClass
	public static void after() {
		s = null;
	}

	@Test
	public void test() {
		int actual = s.minDistance(word1, word2);
		assertEquals(expected, actual);
	}

}
