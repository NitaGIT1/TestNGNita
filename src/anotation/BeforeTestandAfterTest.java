package anotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestandAfterTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox browser");
		driver = new ChromeDriver();
		driver.get(baseUrl);

	}

	@Test
	public void averifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle);

	}
	@Test
	public void verifyHomePage() {
		String expectedTitle = "Register: Mercury Tours";
		driver.findElement(By.xpath("//a[text() ='REGISTER']")).click();
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle);
	}
	@AfterTest
	public void terminateBrowser(){
	driver.close();
	}
}
