package Commonuntions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;



public class Commonoperations 

{
	
	public  WebDriver driver;
	
	
	@BeforeClass
	public void Startbrowser()
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\Testjenkins-master\\chromedriver\\chromedriver.exe");

	 		driver = new ChromeDriver();

 		driver.get("http://dev.zaicrm.com/#/");
 		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void close()

	{
		
		driver.quit();
	}
	
	

}
