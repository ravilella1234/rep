package pageObjectmodel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project.MavenSeleniumBuild_6_30AMBatch.BaseTest;

public class Login extends BaseTest
{
	
	LoginPage page;
	CustomerRegistrationPage reg;
	
	  @BeforeMethod
	  @Parameters("browser")
	  public void beforeMethod(String bType) throws Exception 
	  {
		  init();
		  launchBrowser(bType);
		  navigateUrl("automationurl");
	  }	
	
	
	  @Test(enabled = false)
	  public void login() throws Exception 
	  {
		  
		  page  = new LoginPage(driver);
		  page.customerLogin();
		  
		  Assert.assertEquals(page.verifyLogin(), "Authentication failed.");
	  }
	  
	  
	  @Test
	  public void registration() throws Exception
	  {
		  reg = new CustomerRegistrationPage(driver);
		  reg.customerRegistration();
	  }
  
  

	  @AfterMethod
	  public void afterMethod() 
	  {
		  
	  }

}
