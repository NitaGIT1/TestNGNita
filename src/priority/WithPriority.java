package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithPriority {
	WebDriver driver;

	@Test (priority = 1)
	public void openBrowser() {
		driver = new FirefoxDriver();
	}

	@Test (priority = 2)
	public void launchGoogle() {
		driver.get("https://www.google.com/");
	}

	@Test (priority = 3)
	public void performeSearchAndClick1stLink() {
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("facebook");
		
	}

	@Test (priority = 4)
	public void FaceBookPageTitleVerification() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle().contains("facebook"), true);
		driver.close();
	}

}
