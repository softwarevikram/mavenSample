package my.app.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Search {

	private WebDriver driver;
	String url = "http://google.com";
	String workingDir = System.getProperty("user.dir");
	String driversDir = workingDir + "\\drivers";
	
	@BeforeClass
	public void testSetUp() {
		String chromeDriverPath = driversDir + "\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
	}
	
	@Test
	public void searchGoogle() {
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
