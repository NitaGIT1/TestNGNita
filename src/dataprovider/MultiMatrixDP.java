package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiMatrixDP {
	@Test(dataProvider = "testdata")
	public void TestChrome(String uname,String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(500);
		driver.close();
		}
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
		Object[][] twitterdata = new Object[3][2];
		
		twitterdata[0][0] = "username01@gmail.com";
		twitterdata[0][1] = "password1";
		
		twitterdata[1][0] = "username02@gmail.com";
		twitterdata[1][1] = "password2";
		
		twitterdata[2][0] = "username03@gmail.com";
		twitterdata[2][1] = "password3";
		
		return twitterdata;
		
	}

	
}
