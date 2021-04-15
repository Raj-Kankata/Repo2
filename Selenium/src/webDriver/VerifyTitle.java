package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
static WebDriver driver;

//public static void main(String [] args) {
	
@Test
public void verifyTitle() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	
	//driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	String pageTitle = driver.getTitle();
	
	/*
	 * if(pageTitle.equals("Google")) {
	 * System.out.println("Google application was launched - pass"); } else {
	 * System.out.println("not launched - Fail"); }
	 */
	Assert.assertEquals(pageTitle, "Google");
	
	driver.close();
}
	
	
}
