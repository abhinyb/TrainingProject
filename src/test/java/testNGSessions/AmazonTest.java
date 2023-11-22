package testNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver;

	@BeforeTest
	public void beforeTestAmazonPageTest() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@Test(priority=1)
	public void pageTitleTest() {

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

	}

	@Test(priority=2)
	public void searchPageExistsTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
		

	}

	@Test(priority=3)
	public void loginPageTest() {
		driver.findElement(By.xpath("//span[contains(text(), 'Account & Lists')]")).click();
	}

	@AfterTest
	public void afterTestAmazonPageTest() {
		driver.close();
	}

}
