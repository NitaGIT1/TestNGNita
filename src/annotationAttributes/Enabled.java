package annotationAttributes;

import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void c_language() {
		System.out.println("C Language");
	}

	@Test(enabled = false)
	public void jira() {
		System.out.println("Jira is a testing tool");
	}

	public void java() {
		System.out.println("JAVA Language");
	}
}
