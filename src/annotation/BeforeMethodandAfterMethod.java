package annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodandAfterMethod {

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox browser");
		driver = new ChromeDriver();
		driver.get(baseUrl);

	}

	@BeforeMethod
	public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle);

	}

	@Test
	public void verifyRegisterTitle() {
		String expectedTitle = "Register: Mercury Tours";
		driver.findElement(By.xpath("//a[text() ='REGISTER']")).click();
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle);
	}

	@Test
	public void verifySupportTitle() {
		String expectedTitle = "Under Construction: Mercury Tours";
		driver.findElement(By.xpath("//a[text() ='SUPPORT']")).click();
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle);
	}

	@AfterMethod
	public void goBackToHomePage() {
		driver.findElement(By.xpath("//a[text() ='Home']")).click();

	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
