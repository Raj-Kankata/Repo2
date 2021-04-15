package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ClassParent {
	WebDriver driver;
	
	
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}
	
	@BeforeTest
	public void launchBrowser() { 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
}
	
	
	
}