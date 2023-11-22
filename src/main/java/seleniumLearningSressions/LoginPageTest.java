package seleniumLearningSressions;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();	
		System.out.println(pageTitle);
		
		
		
	}

}
