package switchingToFramesAndWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\MayBatch Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		driver.manage().window().maximize();
		
		List<WebElement> f = driver.findElements(By.tagName("frame"));
		
		System.out.println(f.size());
		
		//driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Selenium")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("DefaultSelenium")).click();
		
	}

}
