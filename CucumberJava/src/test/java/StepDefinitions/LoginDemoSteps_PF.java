package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {
	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("=== I am inside LoginDemoSteps_PF class ===");
		System.out.println("Inside step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is: "+projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		login = new LoginPage_PF(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
		Thread.sleep(3000);
	}
	@And("user clicks on login")
	public void user_clicks_on_login() {
	   login.clickOnLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		home = new HomePage_PF(driver);
		
		boolean homepg = home.checkLogoutIsDisplayed();
		System.out.println("home page logout is: "+homepg);
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
