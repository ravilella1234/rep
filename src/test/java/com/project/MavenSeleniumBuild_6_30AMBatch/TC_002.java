package com.project.MavenSeleniumBuild_6_30AMBatch;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TC_002 extends BaseTest
{
	
  
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	    init();
		test=report.startTest("TC_002");
		test.log(LogStatus.INFO, "Initializing the Properties & configuration files......");
		
		launchBrowser("chromebrowser");
		test.log(LogStatus.PASS, "Opened the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childEnv.getProperty("amazonurl"));
  }
  
  
  @Test
  public void amazon() 
  {
	    selectOption("amazondropbox_id","Books");	
		test.log(LogStatus.PASS, "Selected the option  Books By using the locator :- " + orprop.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_name","Harry potter");
		test.log(LogStatus.PASS, "Entered the text Harry Portter by using the locator :- " + orprop.getProperty("amazonsearchtext_name"));	
		
		elementClick("amzonsearchbotton_xpath");
		test.log(LogStatus.PASS, "Clicked on Search Button By using the locator :- " + orprop.getProperty("amzonsearchbotton_xpath"));
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
	  report.endTest(test);
	  report.flush();
	  
  }

}
