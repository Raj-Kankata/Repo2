package commands;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import config.StartBrowser;

public class ActionDriver {
	
	WebDriver driver;
	
	public ActionDriver() 
	{
		driver = StartBrowser.driver;
	}
	
	public void navigateToApplication(String url)
	{
		try {
			driver.get(url);
			StartBrowser.childTest.pass("Successfully navigated to  : "+url);
		} catch(Exception e) {
			StartBrowser.childTest.fail("Successfully navigated to  : "+url);
			
		}
			
		
	}
	
	public void click(By locator, String eleName) throws IOException
	{
		try {
			driver.findElement(locator).click();
			StartBrowser.childTest.pass("Successfully clicked on  : "+eleName);
		}catch(Exception e) {
			StartBrowser.childTest.fail("Unable to click on  : "+eleName , 
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
		}
		
	}
	public void type(By locator, String text, String eleName) throws Exception
	{
		try {
		driver.findElement(locator).sendKeys(text);
		StartBrowser.childTest.pass("successfully typed in :" + eleName + " With data : "+text);
	} catch(Exception e) {
		StartBrowser.childTest.fail("Unable to type in  : "+eleName + " With data : "+text , 
				MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
		StartBrowser.childTest.info(e);
		
	}
	}
	

	public String screenShot() {
		{
			return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		}
	}
}
