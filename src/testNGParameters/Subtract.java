package testNGParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtract {
	@Test
	@Parameters({ "a", "b" })

	public void sub(int c, int d) {
		int sub = c - d;
		System.out.println("Subtraction = "+sub);
	}
}
