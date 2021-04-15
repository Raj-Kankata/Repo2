package tests;

import static org.testng.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tests extends BaseClass {

	/*
	 * @Test public void testOne() { driver.get("https://google.com/");
	 * 
	 * 
	 * driver.findElement(By.name("q")).sendKeys("automation");
	 * driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 * 
	 * System.out.println("Completed Test One...");
	 * 
	 * }
	 */
	
	
	/*
	 * @Test public void testTwo() { driver.get("https://google.com/");
	 * 
	 * 
	 * driver.findElement(By.name("q")).sendKeys("Rajkumar");
	 * driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 * 
	 * System.out.println("Completed Test Two...");
	 * 
	 * }
	 */
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.id("txtUsername")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
	    
//	    for (int second = 0;; second++) {
//	    	if (second >= 30) fail("timeout");
//	    	try { if (isElementPresent(By.id("btnLogin"))) break; } catch (Exception e) {}
//	    	Thread.sleep(1000);
//	    }
//	    
//	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
	}
	
	    private boolean isElementPresent(By by) {
	        try {
	          driver.findElement(by);
	          return true;
	        } catch (NoSuchElementException e) {
	          return false;
	        }
	      }
	
}
