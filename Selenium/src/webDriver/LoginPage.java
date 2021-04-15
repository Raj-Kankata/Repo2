package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;

//create web elements using Element Locators

By User = By.name("username");
By Pwd = By.name("password");
By LoginButton = By.id("tdb1");
By ErrorMessage = By.className("messageStackError");
By CatalogLink = By.linkText("Online Catalog");

public LoginPage(WebDriver driver) {
	this.driver = driver;
}

//Create customized commands

public void typeUsername(String Uname) {
	driver.findElement(User).sendKeys(Uname);
}

public void typePassword(String Password) {
	driver.findElement(Pwd).sendKeys(Password);
}

public void clickLoginButton() {
	driver.findElement(LoginButton).click();
}

public String captureErrorMessage() {
	String message = driver.findElement(ErrorMessage).getText();
	return message;
}

public void clickLink() {
	driver.findElement(CatalogLink).click();
}














}
