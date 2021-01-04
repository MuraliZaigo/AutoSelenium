package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkpassword_limits extends Commonoperations

{
	
	@Test
	public void checkpassword_limit()
	{
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.password.sendKeys("hel");
		Loginobjects.login.click();
		String user_text=Loginobjects.loginpassword_err.getText();
		System.out.println(user_text);
		Assert.assertEquals(user_text,"Your password must be at least of length 7");
		
		
	}
	
	
}
