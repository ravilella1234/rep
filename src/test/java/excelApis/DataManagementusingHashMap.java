package excelApis;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataManagementusingHashMap 
{
 
  @Test(dataProvider = "testData")
  public void f(Hashtable<String, String> data) 
  {
	  if(data.get("Runmode").equals("Y"))
	  System.out.println(data.get("Runmode") + " -- " + data.get("Browser") + " -- " + data.get("UserName") + " -- " + data.get("UserPassword"));
	 
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\MayBatch Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(data.get("UserName"));
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(data.get("UserPassword"));
  }
  
  @DataProvider
  public Object[][] testData() throws Exception 
  {
	  
	    ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\SuiteA.xlsx");
		String sheetName = "Data";
		String testcaseName = "LoginTest";
		return DataUtils.getTestData(e, sheetName, testcaseName);  
  }
}
