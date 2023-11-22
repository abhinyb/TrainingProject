package testNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class loginCostcoTest {

	@Test
	public void loginPageTestCostco() {
		SafariDriver driver = new SafariDriver();
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();

		driver.quit();

	}

	@Test
	public void loginPageValidation() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		driver.findElement(By.xpath("//*[@id=\"closeEmailPopup\"]/span")).click();

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

	}

}
