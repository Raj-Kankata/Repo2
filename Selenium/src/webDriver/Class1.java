package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 extends ClassParent {
	//WebDriver driver;
	
  //@BeforeTest
  //@BeforeClass
  //@BeforeMethod
  //@Test(priority=1)
	/*
	 * public void launchBrowser() { System.setProperty("webdriver.chrome.driver",
	 * "chromedriver.exe"); driver = new ChromeDriver(); //
	 * driver.manage().window().maximize(); }
	 */
	  @Test(priority=1)
	  public void verifyGoogle() {
		  driver.get("https://www.google.com/");
		  Assert.assertEquals(driver.getTitle(), "Google");  
	  }
	  
	  @Test(priority=2)
	  public void verifyYahoo() {
		  driver.get("https://www.yahoo.com/");
		  Assert.assertEquals(driver.getTitle(), "Yahoo");  
	  }
	  
	  @Test(priority=3)
	  public void verifyGcrit() {
		  driver.get("http://gcreddy.com/project/admin/login.php");
		  Assert.assertEquals(driver.getTitle(), "osCommerce Online Merchant Administration Tool");  
	  }
	  
		/*
		 * @AfterTest //@AfterClass //@AfterMethod //@Test(priority=5) public void
		 * closeBrowser() { driver.close(); }
		 */
	  
  }

