package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGWithoutPriority {
	WebDriver driver;

	@Test
	public void openBrowser() {
		driver = new ChromeDriver();
	}

	@Test
	public void launchGoogle() {
		driver.get("https://www.google.com/");
	}

	@Test
	public void performeSearchAndClick1stLink() {
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("facebook");
	}

	@Test
	public void FaceBookPageTitleVerification() throws InterruptedException {
		driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']"));
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle().contains("facebook - Google Search"), true);
		driver.close();
	}

}
