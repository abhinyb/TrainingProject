package testNGSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginPageTest {
	
	@BeforeSuite
	public void connectToDB() {
		System.out.println("BS - Connect to DataBase");
	}
	@BeforeClass
	public void openBrowserwithURL() {
		System.out.println("BC - openBrowserwithURL");
	}
	@BeforeTest
	public void homePage() {
		System.out.println("BT - homePage");
	}
	@BeforeMethod
	public void navigateToHomePage() {
		System.out.println("BM - navigateToHomePage");
	}

	@Test(priority = 1)
	public void openBrowser() {

		System.out.println("This is my TestNG Test just a DEMO");

	}

	@Test
	public void openBrowserLaunchUrl() {
		System.out.println("This is my 2nd Test");

	}
	
	@Test
	public void loginPageTestCostco() {
		SafariDriver driver = new SafariDriver();
		driver.get("https://www.costco.com/");
		driver.quit();

	}

	@Test
	public void loginPageValidation() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

	}
	
	@AfterMethod
	public void closeHomePage() {
		System.out.println("AM - closeDBConnection");
	}
	@AfterTest
	public void homePageAfterTest() {
		System.out.println("AT - homePageAfterTest");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - closeBrowser");
	}
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS - navigateToHomePage");
	}

}