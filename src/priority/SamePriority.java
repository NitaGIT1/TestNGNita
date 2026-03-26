package priority;

import org.testng.annotations.Test;

public class SamePriority {
	//no priority and zero priority are same.
	@Test (priority = 3)
	public void  c_method() {
		System.out.println("I'm in method C");
	}
	@Test (priority = 9)
	public void  a_method() {
		System.out.println("I'm in method A");
	}
	@Test (priority = 1)
	public void  b_method() {
		System.out.println("I'm in method B");
	}
	@Test (priority = 9)
	public void  e_method() {
		System.out.println("I'm in method E");
	}
	@Test (priority = 2)
	public void  d_method() {
		System.out.println("I'm in method D");
	}
}
