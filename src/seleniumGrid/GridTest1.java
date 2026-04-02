package seleniumGrid;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest1 {
	@Test
	public void runOnGrid() throws Exception {
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.40:4444"), new ChromeOptions());
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
