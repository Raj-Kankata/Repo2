package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		boolean linkpresent = driver.findElement(By.linkText("Gmail")).isDisplayed();
        System.out.println(linkpresent);
        
        boolean linkstat = driver.findElement(By.linkText("Gmail")).isEnabled();
        System.out.println(linkstat);
        
		String linkname = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(linkname);

		driver.findElement(By.linkText("Gmail")).click();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		
		boolean linkstat1 = gmailLink.isDisplayed();
		System.out.println(linkstat1);
		
		linkstat = gmailLink.isEnabled();
		System.out.println(linkstat);
		
		String linkName = gmailLink.getText();
		System.out.println(linkName);
		
		Thread.sleep(3000);
		gmailLink.click();
		
		
driver.get("https://gcreddy.com/project/create_account.php");
		
		boolean status = driver.findElement(By.name("newsletter")).isDisplayed();
		System.out.println(status); //true
		
		status = driver.findElement(By.name("newsletter")).isEnabled();
		System.out.println(status); //true
		
		status = driver.findElement(By.name("newsletter")).isSelected();
		System.out.println(status); //true
		
		driver.findElement(By.name("newsletter")).click();
		
		Thread.sleep(3000);
		
		status = driver.findElement(By.name("newsletter")).isSelected();
		System.out.println(status); //true
		
		
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
