package com.project.MavenSeleniumBuild_6_30AMBatch456;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTestClass1 {
  @Test
  public void f() 
  {
	  System.out.println("f Test  -  NewTestClass1");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod  -  NewTestClass1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod  -  NewTestClass1");
  }

}
