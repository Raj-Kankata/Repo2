package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	
	static AppiumDriver<MobileElement> driver;
	
	
	public static void main(String[] args) {
		try {
		openCalculator();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}

	public static void openCalculator() throws Exception  {
		
		DesiredCapabilities cap = new DesiredCapabilities();
				
				cap.setCapability("deviceName", "Moto Z3 Play");
				cap.setCapability("udid", "NS9Z310200");
				cap.setCapability("platformName", "Android");
				cap.setCapability("platformVersion", "9");
				
				cap.setCapability("appPackage", "com.google.android.calculator");
				cap.setCapability("appActivity", "com.android.calculator2.*");
			
				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				
			driver = new AppiumDriver<MobileElement> (url, cap);
				
				System.out.println("Appllication Started....");
				
						
	}
}
