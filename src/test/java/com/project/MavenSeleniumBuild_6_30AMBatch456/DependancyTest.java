package com.project.MavenSeleniumBuild_6_30AMBatch456;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DependancyTest
{
  @Test(priority = 1)
  public void orange()
  {
	  System.out.println("orange");
  }
  
  @Test(priority = 2,dependsOnMethods = {"orange"})
  public void white()
  {
	  System.out.println("white");
  }
  
  @Test(priority = 3,dependsOnMethods = {"white"})
  public void blue()
  {
	  System.out.println("blue");
	 // Assert.assertTrue(false, "Test failed....");
	 throw new SkipException("Test is faild....");
  }
  
  @Test(priority = 4,dependsOnMethods = {"blue"})
  public void green()
  {
	  System.out.println("green");
  }
  
  
}
