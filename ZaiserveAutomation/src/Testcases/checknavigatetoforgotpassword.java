package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checknavigatetoforgotpassword extends Commonoperations

{
	
	@Test
	public void checkforgotpasswordlink()
	{
		//check navigate to forgot password page
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.forgot_password.click();
		String user_text= driver.getCurrentUrl();
		Assert.assertEquals(user_text,"http://dev.zaicrm.com/#/forgot-password" );
	}
	
	
}