package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://gcreddy.com/project/create_account.php");
		WebElement checkbox = driver.findElement(By.name("newsletter"));
		
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		
		checkbox.click();
		
		Thread.sleep(3000);
		System.out.println(checkbox.isSelected());
			
		
		
		
		driver.close();
		

	}

}
