package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ClassG {
	WebDriver driver;
	
	
	@Test(groups = {"sanity", "regression"}, priority=1)
	public void launchBrowser() { 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
}
	@Test(groups = {"sanity", "regression"}, priority=7)
	public void closeBrowser(){
		driver.close();
	}
	@Test(groups = {"sanity", "regression"}, priority=2)
	  public void verifyGcrit() {
		  driver.get("http://gcreddy.com/project/admin/login.php");
		  Assert.assertEquals(driver.getTitle(), "osCommerce Online Merchant Administration Tool");  
	  }
	
	@Test(groups = {"sanity"}, priority=3)
	  public void verifyGoogle() {
		  driver.get("https://www.google.com/");
		  Assert.assertEquals(driver.getTitle(), "Google");  
	  }
	  
	  @Test(groups = {"regression"}, priority=4)
	  public void verifyYahoo() {
		  driver.get("https://www.yahoo.com/");
		  Assert.assertEquals(driver.getTitle(), "Yahoo");  
	  }
	  
	  @Test(groups = {"regression"}, priority=5)
	  public void verifyBoA() {
		  driver.get("https://www.bankofamerica.com/");
		  Assert.assertEquals(driver.getTitle(), "Bank of America - Banking, Credit Cards, Loans and Merrill Investing");  
	  }
	  
	  @Test(groups = {"regression"}, priority=6)
	  public void verifyICICI() {
		  driver.get("https://www.icicibank.com/");
		  Assert.assertEquals(driver.getTitle(), "Personal Banking & Netbanking Services Online - ICICI Bank");  
	  }
}
