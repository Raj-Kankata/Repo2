package reuse;

import org.openqa.selenium.WebDriver;

import commands.ActionDriver;
import config.StartBrowser;
import or.HomePage;
import or.LoginPage;

public class BusinessFunctions {
	WebDriver driver;
	ActionDriver aDriver;
	
	public BusinessFunctions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}
	
	public void login() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to Application");
		
		  aDriver.navigateToApplication("http://gcreddy.com/project/admin/login.php");
		  aDriver.type(LoginPage.txtUserName, "gcreddy", "UserName");
		  aDriver.type(LoginPage.txtPassword, "Temp@2020", "Password");
		  aDriver.click(LoginPage.btnLogin, "Login button");
		 
	}
	
	public void logout() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Logout of Application");
		
		  aDriver.click(HomePage.lnkLogout, "Logout link");
		 
	}

}
