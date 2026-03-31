package testNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTestNG.class)
public class TestNG {

	WebDriver driver = new ChromeDriver();

	@Test // SuccessTest
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}

	@Test // FailedTest
	public void OpenBrowser() {
		driver.get("https://www.demoqa.com");
		String expectedTitle = "FreeQAAutomationToolsForEveryone";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
	}

	private int i = 1;

	@Test(successPercentage = 60, invocationCount = 3) // FailingWithinSuccess
	public void AccountTest() {
		if (i < 2)
			Assert.assertEquals(i, i);
		i++;
	}

	@Test // SkipTest
	public void SkipTest() {
		throw new SkipException("SkippingTheTestMethod");
	}
}
