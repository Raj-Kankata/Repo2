package scripts;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.BusinessFunctions;

public class TC02 extends StartBrowser {
  @Test
  public void testLogin_Logout() throws Exception {
	  
	  BusinessFunctions bFunctions = new BusinessFunctions();
	  bFunctions.login();
	  bFunctions.logout();
  }
}
