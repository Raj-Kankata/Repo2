package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginPage page = new LoginPage(driver);
		
		driver.get("http://gcreddy.com/project/admin/login.php");
		page.typeUsername("gcreddy1");
		page.typePassword("Temp@2020");
		page.clickLoginButton();
		
		String error = page.captureErrorMessage();
		
		if(error.contains("Error: Invalid administrator login attempt.")) {
			System.out.println("Login Unsuccessful and showing correct error message - pass");
		}
		else {
			System.out.println("not showing error message - fail");
		}
		
		driver.close();
	}

}
