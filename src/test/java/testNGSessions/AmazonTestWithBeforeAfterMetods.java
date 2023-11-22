package testNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestWithBeforeAfterMetods {
	
	WebDriver driver;
	

	@BeforeMethod
	public void beforeMethodAmazonPageTest() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@Test
	public void pageTitleTest() {

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

	}

	@Test
	public void searchPageExistsTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
		

	}

	@Test
	public void loginPageTest() {
		driver.findElement(By.xpath("//span[contains(text(), 'Account & Lists')]")).click();
	}

	@AfterMethod
	public void afterMethodAmazonPageTest() {
		driver.close();
	}


}
