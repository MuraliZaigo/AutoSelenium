package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkwithusernamenull extends Commonoperations

{
	
	@Test
	public void checkwithusernameempty() throws 
	{
		//check with user id null
	
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("hello");
		Thread.sleep(5000);
		//Loginobjects.login.click();
		//String user_text=Loginobjects.email_err.getText();
		//Assert.assertEquals(user_text,"Enter your e-mail");
	}
	
	
}
