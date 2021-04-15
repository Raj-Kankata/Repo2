package webDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {
WebDriver driver;

@Test(dataProvider = "testdata")
public void adminLogin(String UName, String Pwd) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	
	driver.get("http://gcreddy.com/project/admin/login.php");
	driver.findElement(By.name("username")).sendKeys(UName);
	driver.findElement(By.name("password")).sendKeys(Pwd);
	driver.findElement(By.id("tdb1")).click();
	
	Thread.sleep(3000);
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "http://gcreddy.com/project/admin/index.php");
}

@AfterMethod
public void closeBrowser() {
	driver.close();
}

	
	@DataProvider(name = "testdata")
	
	//public static void main(String[] args)
	public Object [][] readExcel() throws BiffException, IOException {
		File f = new File("C:\\Users\\Rajkumar\\Desktop\\Input1.xls");
		
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		
		int columns = s.getColumns();
		int rows = s.getRows();
		//System.out.println(columns+" "+rows);
		
		String inputData [] [] = new String [rows] [columns];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				Cell c = s.getCell(j, i);
				inputData[i][j] = c.getContents();
				//System.out.println(inputData[i][j]);
				
			}
		}
		return inputData;
		
		
	}

}
