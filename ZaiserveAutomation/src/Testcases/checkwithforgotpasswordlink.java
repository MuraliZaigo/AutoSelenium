package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkwithforgotpasswordlink extends Commonoperations

{
	
	@Test
	public void checkforgotpasswordlink()
	{
		//check forgot password link is present
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		String user_text=Loginobjects.forgot_password.getText();
		
		Assert.assertEquals(user_text,"Forgot password");
	}
	
	
}

