package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailAssertions {

	@Test
	public void testOne() {
		Assert.assertTrue(false, "Assert Failed as the actual condition is False");
	}

	@Test
	public void testTwo() {
		Assert.assertFalse(true, "Assert Failed as the actual condition is True");
	}

	@Test
	public void testThree() {
		String s = null;
		Assert.assertNotNull(s, "Assert Failed as the String is Null");
	}

	@Test
	public void testFour() {
		String s = "Shree";
		Assert.assertNull(s, "Assert Failed as the String is NOT NULL");
	}

	@Test
	public void testFive() {
		String s1 = "Krishna";
		String s2 = "Sarika";
		Assert.assertEquals(s1, s2, "Assert Failed as the two string are NOT EQUAL");
	}

	@Test
	public void testSix() {

        String s1 = "Krishna";
		String s2 = "Krishna";
		Assert.assertNotEquals(s1, s2, "Assert Failed as the two string are EQUAL");
    }

}
