package webDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EleLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Alert popup = driver.switchTo().alert();
		String errmsg = popup.getText();
		
		Thread.sleep(3000);
		System.out.println(errmsg);
		
		popup.accept();
		driver.findElement(By.id("login1")).sendKeys("India123");
		
		driver.close();
	}

}
