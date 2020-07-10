package pageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.MavenSeleniumBuild_6_30AMBatch.BaseTest;

public class CustomerRegistrationPage extends BaseTest
{
	
	
	
	@FindBy(xpath="//a[@class='login']") public WebElement signIn;
	@FindBy(id="email_create") public WebElement custEmail;
	@FindBy(id="SubmitCreate") public WebElement Submit;
	@FindBy(xpath=".//*[@id='create_account_error']/ol/li") public WebElement error;
	@FindBy(id="id_gender1") public WebElement Title_gen1;
	@FindBy(id="id_gender2") public WebElement Title_gen2;
	@FindBy(id="customer_firstname") public WebElement FirstName;
	@FindBy(id="customer_lastname") public WebElement LastName;
	@FindBy(id="passwd") public WebElement custPassword;
	@FindBy(id="days") public WebElement DOB_day;
	@FindBy(id="months") public WebElement DOB_month;
	@FindBy(id="years") public WebElement DOB_year;
	@FindBy(id="firstname") public WebElement FirtName_address;
	@FindBy(id="lastname") public WebElement LastName_address;
	@FindBy(id="company") public WebElement Company;
	@FindBy(id="address1") public WebElement Address_1;
	@FindBy(id="address2") public WebElement Address_2;
	@FindBy(id="city") public WebElement City;
	@FindBy(id="id_state") public WebElement State;
	@FindBy(id="postcode") public WebElement Postcode;
	@FindBy(id="id_country") public WebElement Country;
	@FindBy(id="other") public WebElement TextArea;
	@FindBy(id="phone") public WebElement Phone;
	@FindBy(id="phone_mobile") public WebElement Mobile_Phone;
	@FindBy(id="alias") public WebElement Alias_address;
	@FindBy(id="submitAccount") WebElement submitAccount;
	
	
	public CustomerRegistrationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void customerRegistration() throws InterruptedException
	{
		signIn.click();
			
		waitforElement(60,custEmail,"visible");
		String str= p.getProperty("firstname")+p.getProperty("lastname")+randomNum()+p.getProperty("domain");
		custEmail.sendKeys(str);
		System.out.println(str);
		
		Submit.click();
		waitforElement(30, Title_gen1,"clickable");
		Title_gen1.click();
		
		FirstName.sendKeys("qa");
		LastName.sendKeys("test");
		custPassword.sendKeys("password");
		
		//DOB_day.sendKeys("20");	
		//DOB_month.sendKeys("April");
		//DOB_year.sendKeys("1981");
		
		selectOption(DOB_day,3);
		selectOption(DOB_month, 5);
		selectOption(DOB_year, 6);
		
		Address_1.sendKeys("hyderabad");
		City.sendKeys("hyderabad");
		State.sendKeys("California");
		Postcode.sendKeys("23456");
		Country.sendKeys("United States");
		Mobile_Phone.sendKeys("1234567890");
	}

	

	

	

}
