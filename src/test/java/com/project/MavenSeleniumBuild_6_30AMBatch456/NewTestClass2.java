package com.project.MavenSeleniumBuild_6_30AMBatch456;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTestClass2 {
  @Test
  public void g() 
  {
	  System.out.println(" g test -  NewTestClass2");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforeMethod  - NewTestClass2");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod  - NewTestClass2");
  }

}
