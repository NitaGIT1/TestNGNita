package assertions;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PassAssertions {

	@Test
	public void testOne()
	{
	Assert.assertTrue(true, "Assert Failed as the actual condition is False");
	}
	
	@Test
	public void testTwo()
	{
	Assert.assertFalse(false, "Assert Failed as the actual condition is True");
	}
	
	@Test
	public void testThree()
	{
	String s = "Krishna";
	Assert.assertNotNull(s,"Assert Failed as the String is Null");
	}
	@Test
	public void testFour()
	{
	String s = null;
	Assert.assertNull(s, "Assert Failed as the String is NOT NULL");
	}
	@Test
	public void testFive()
	{
	String s1 = "Krishna";
	String s2 = "Krishna";
	Assert.assertEquals(s1, s2, "Assert Failed as the two string are NOT EQUAL");
	}
	@Test
	public void testSix()
	{
	String s1 = "Krishna";
	String s2 = "Sarika";
	Assert.assertNotEquals(s1, s2, "Assert Failed as the two string are EQUAL");
	}
}
