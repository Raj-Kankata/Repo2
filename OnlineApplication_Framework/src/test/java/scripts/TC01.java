package scripts;

import org.testng.annotations.Test;

import commands.ActionDriver;
import config.StartBrowser;
import or.LoginPage;

public class TC01 extends StartBrowser {
  @Test
  public void testLogin() {
	  ActionDriver aDriver = new ActionDriver();
		/*
		 * aDriver.navigateToApplication("http://gcreddy.com/project/admin/login.php");
		 * aDriver.type(LoginPage.txtUserName, "gcreddy");
		 * aDriver.type(LoginPage.txtPassword, "Temp@2020");
		 * aDriver.click(LoginPage.btnLogin);
		 */
	  
  }
}
