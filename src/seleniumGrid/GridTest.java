package seleniumGrid;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTest {
	@Parameters("browser")
	@Test
	public void runOnGrid(String browser) throws Exception {
		WebDriver driver;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new RemoteWebDriver(
					new URL("http://192.168.1.40:4444"), 
					new ChromeOptions());

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new RemoteWebDriver(
					new URL("http://192.168.1.40:4444"), 
					new FirefoxOptions());
			
		} else {
			throw new RuntimeException("Invalid browser value");
		}
		driver.get("http://www.google.com");
		driver.quit();
	}

}
