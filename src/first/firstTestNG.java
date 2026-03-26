package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTestNG {
	public String baseURL ="https://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	
	@Test 
	public void verifyHomePageTitle() {
		System.out.println("Launching chrome browser");
		driver =  new ChromeDriver();
		driver.get(baseURL);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle =driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}
}
