package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Tc1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	POM login = new POM(driver);
	
	driver.get("http://gcreddy.com/project/admin/login.php");
	login.typeUsername("gcreddy1");
	login.typePassword("Temp@2020");
	login.clickLoginButton();
	
	String url = driver.getCurrentUrl();
	
	if(url.contains("http://gcreddy.com/project/admin/index.php")) {
		System.out.println("Admin Login Successful - Pass");
	}
	else {
		System.out.println("fail");
	}
		
	driver.close();
		
	}

}
