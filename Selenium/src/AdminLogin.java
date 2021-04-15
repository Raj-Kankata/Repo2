import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

public static void main(String[] args) throws InterruptedException {
		
	/*
	 * System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); WebDriver
	 * driver = new ChromeDriver();
	 * 
	 * driver.get("https://www.selenium.dev/downloads/");
	 * driver.manage().window().maximize();
	 */

System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://accounts.google.com/AddSession/identifier?hl=en&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAlAmgQ&flowName=GlifWebSignIn&flowEntry=AddSession");

String TxtArea = driver.findElement(By.xpath("//*[@id=\'headingSubtext\']/span")).getText();
System.out.println(TxtArea);

driver.findElement(By.id("identifierNext")).click();

Thread.sleep(3000);

System.out.println(driver.findElement(By.id("//*[@id=\'view_container\']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText());



	
//driver.close();

	
}

}
