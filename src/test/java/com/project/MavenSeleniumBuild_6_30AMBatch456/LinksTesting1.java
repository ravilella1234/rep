package com.project.MavenSeleniumBuild_6_30AMBatch456;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project.MavenSeleniumBuild_6_30AMBatch.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class LinksTesting1 extends BaseTest
{


	@BeforeMethod(groups = {"regression"})
	@Parameters("browser")
	public void setup(String bType) throws Exception
	{
		init();
		test=report.startTest("LinksTesting1");
		test.log(LogStatus.INFO, "Initializing the Properties & configuration files......");
		
		launchBrowser(bType);
		test.log(LogStatus.PASS, "Opened the Browser : " + bType);
		
		navigateUrl("googleurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childEnv.getProperty("googleurl"));
		
	}
	
	
	
	
	@Test(groups = {"regression"})
	public void linktesting1()
	
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod(groups = {"regression"})
	public void tearDown()
	{
		driver.quit();
		
		report.endTest(test);
		  report.flush();
	}

}
