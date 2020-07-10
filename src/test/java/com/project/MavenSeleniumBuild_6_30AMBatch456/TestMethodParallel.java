package com.project.MavenSeleniumBuild_6_30AMBatch456;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodParallel 
{
	WebDriver driver;
	
  @Test
  public void test1() 
  {
	  System.out.println("iam test1 method...." + Thread.currentThread().getId());
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\MayBatch Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
  }
  
  
  @Test
  public void test2() 
  {
	  System.out.println("iam test2 method...." + Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\MayBatch Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.bestbuy.com");
  }
  
  
  @Test
  public void test3() 
  {
	  System.out.println("iam test3 method...." + Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\MayBatch Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.ebay.com");
  }
  
}
