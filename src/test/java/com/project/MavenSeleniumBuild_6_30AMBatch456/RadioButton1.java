package com.project.MavenSeleniumBuild_6_30AMBatch456;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project.MavenSeleniumBuild_6_30AMBatch.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class RadioButton1 extends BaseTest
{

	@BeforeMethod(groups = {"regression","smoke"})
	@Parameters("browser")
	  public void beforeMethod(String bType) throws Exception 
	  {
		
		init();
		test=report.startTest("RadioButton1");
		test.log(LogStatus.INFO, "Initializing the Properties & configuration files......");
		
		launchBrowser(bType);
		test.log(LogStatus.PASS, "Opened the Browser : " + bType);
		
		navigateUrl("radiourl");
		test.log(LogStatus.PASS, "Navigated to url : " + childEnv.getProperty("radiourl"));
		
	  }
	
	
	@Test(groups = {"regression","smoke"})
	public void checkboxTest() throws Exception
	{
		Thread.sleep(3000);
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod(groups = {"regression","smoke"})
  public void afterMethod() 
  {
	  driver.quit();
	  
	  report.endTest(test);
	  report.flush();
  }
	
}
