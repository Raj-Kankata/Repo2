package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redirect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LoginPage redirect = new LoginPage(driver);
		driver.get("http://gcreddy.com/project/admin/login.php");
		
		redirect.typeUsername("gcreddy");
		redirect.typePassword("Temp@2020");
		redirect.clickLoginButton();
		
		Thread.sleep(3000);
		
		
		
		redirect.clickLink();
		
		String url = driver.getCurrentUrl();
		if(url.contains("http://gcreddy.com/project/")) {
			System.out.println("Page redirecting from Admin to User Interface - pass");
		}
		else {
			System.out.println("Page not redirecting - fial");
		}
		
		driver.close();
	}

}
