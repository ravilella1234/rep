package com.project.MavenSeleniumBuild_6_30AMBatch456;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.project.MavenSeleniumBuild_6_30AMBatch.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TC_004 extends BaseTest
{
	
  
  @BeforeMethod()
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception 
  {
	    init();
		launchBrowser(bType);
		navigateUrl("amazonurl");
  }
  
  
  @Test(enabled = false)
  public void amazon() 
  {
	   if(driver.findElement(By.linkText("Customer Service")).isDisplayed())
	   {
		   System.out.println("Link is displayed");
	   }
	   else
	   {
		   System.out.println("Link is not displayed");
	   }
  }
  
  
  @Test(enabled = false)
  public void amazon1()
  {
	String actualLink = driver.findElement(By.linkText("Customer Service")).getText();  
	String expectedLink = "Customer Servic";
	
	if(actualLink.equals(expectedLink))
		System.out.println("Both links are equal...");
	else
		System.out.println("Both links are not equal...");
	
  }
  
  @Test(enabled = false)
  public void assertbooleanAmazon()
  {
	  Assert.assertTrue(driver.findElement(By.linkText("Customer Service")).isDisplayed(), "Link is not displayed...");
  }
  
  
  @Test()
  public void assertEqualsAmazon()
  {
	  String actualLink = driver.findElement(By.linkText("Customer Service")).getText();  
	  String expectedLink = "Customer Servic";
	  
	  //Assert.assertEquals(actualLink, expectedLink);
	  
	  //Assert.assertTrue(actualLink.equals(expectedLink), "Both links are not equal...");
	  SoftAssert s = new SoftAssert();
	  s.assertEquals(actualLink, expectedLink);
	  
	  s.assertTrue(actualLink.equals(expectedLink), "Both links are not equal...");
	  
	  s.assertTrue(false, "error1");
	  
	  s.assertTrue(true, "error2");
	  
	  s.assertTrue(false, "error3");
	  
	  s.assertTrue(true, "error4");
	  
	  driver.findElement(By.linkText("Customer Service")).click();
	  
	  s.assertAll();
	  
  }
  
  

  @AfterMethod()
  public void afterMethod() 
  {
	  
	  
  }

}
