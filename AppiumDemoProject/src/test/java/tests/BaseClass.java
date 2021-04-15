package tests;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
//		caps.setCapability("platformName", "Android");
//		caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto Z3 Play");
		caps.setCapability(MobileCapabilityType.UDID, "NS9Z310200");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
//		caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, caps);
//		driver = new AndroidDriver<MobileElement>(url, caps);
//		driver = new IOSDriver<MobileElement>(url, caps);
		
		// INIT CHROME OPTIONS
	    ChromeOptions options = new ChromeOptions();
	    Map < String, Object > prefs = new HashMap < String, Object > ();
	    Map < String, Object > profile = new HashMap < String, Object > ();
	    Map < String, Object > contentSettings = new HashMap < String, Object > ();
		
		// SET CHROME OPTIONS
	    // 0 - Default, 1 - Allow, 2 - Block
	    contentSettings.put("geolocation", 2);
	    profile.put("managed_default_content_settings", contentSettings);
	    prefs.put("profile", profile);
	    options.setExperimentalOption("prefs", prefs);
		
		
		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is :"+exp.getMessage());
			exp.printStackTrace();
			
			
			
		}
	}
	@Test
	public void sampleTest() {
		System.out.println("I am inside the sample Test");
	}
	
	@AfterSuite
	public void teardown() {
		driver.close();
		driver.quit();
		
	}


}
