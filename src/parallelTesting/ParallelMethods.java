package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelMethods {
	ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	@Test
	public void fireFoxTest() {
		driver.set(new FirefoxDriver());
		driver.get().get("https://www.saucedemo.com/");
		driver.get().findElement(By.id("user-name")).sendKeys("standard_user");
		driver.get().findElement(By.id("password")).sendKeys("secret_sauce");
		driver.get().findElement(By.id("login-button")).click();
		driver.get().quit();
		
	}
	@Test
	public void chromeTest() {
		driver.set(new ChromeDriver());
		driver.get().get("https://www.facebook.com/");
		driver.get().findElement(By.id("_R_64qjbjb9pb6amH1_")).sendKeys("abc@gmail.com");
		driver.get().findElement(By.id("_R_66qjbjb9pb6amH1_")).sendKeys("12345");
		driver.get().findElement(By.xpath("//div[@aria-label='Log in']")).click();
		driver.get().quit();
	}
	
}
