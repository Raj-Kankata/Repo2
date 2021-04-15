package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginPage page = new LoginPage(driver);
		
		driver.get("http://gcreddy.com/project/admin/login.php");
		page.typeUsername("gcreddy");
		page.typePassword("Temp@2020");
		page.clickLoginButton();
		
		 
		
		
	}

}
