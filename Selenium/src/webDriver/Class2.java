package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 extends ClassParent {
//WebDriver driver;

/*
 * @BeforeClass //@BeforeMethod //@Test(priority=1) public void launchBrowser()
 * { System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); driver =
 * new ChromeDriver(); // driver.manage().window().maximize(); }
 */
		  @Test(priority=5)
		  public void verifyBoA() {
			  driver.get("https://www.bankofamerica.com/");
			  Assert.assertEquals(driver.getTitle(), "Bank of America - Banking, Credit Cards, Loans and Merrill Investing");  
		  }
		  
		  @Test(priority=4)
		  public void verifyICICI() {
			  driver.get("https://www.icicibank.com/");
			  Assert.assertEquals(driver.getTitle(), "Personal Banking & Netbanking Services Online - ICICI Bank");  
		  }
		  
		 		  
			/*
			 * @AfterClass //@AfterMethod //@Test(priority=5) public void closeBrowser() {
			 * driver.close(); }
			 */

	
	
}
