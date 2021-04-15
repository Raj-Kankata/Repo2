package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM {

	WebDriver driver;
	
	By User = By.name("username");
	By Pwd = By.name("password");
	By LoginButton = By.id("tdb1");
	
	public POM (WebDriver Raj) {
		this.driver = Raj;
	}
	
	public void typeUsername(String Uname) {
	driver.findElement(User).sendKeys(Uname);
	}
	
	public void captureUsername() {
		driver.findElement(User).getAttribute("value");
		}
	
	public void clearUsername() {
		driver.findElement(User).clear();
		}
	
	public void typePassword(String Password) {
		driver.findElement(Pwd).sendKeys(Password);
		}
	
	public void clickLoginButton() {
		driver.findElement(LoginButton).click();
		}

	
}
