package pageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(linkText="Sign in")public WebElement logIn;
	@FindBy(id="email")public WebElement customerEmail;
	@FindBy(id="passwd")public WebElement customerPassword;
	@FindBy(xpath="//p[@class='submit']//span[1]")public WebElement signIn ;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")public WebElement getLoginErrText;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerLogin() throws Exception
	{
		logIn.click();
		Thread.sleep(3000);
		customerEmail.sendKeys("qatest748378@gmail.com");
		customerPassword.sendKeys("password");
		signIn.click();
	}
	
	public String verifyLogin()
	{
		return getLoginErrText.getText();
	}

}
