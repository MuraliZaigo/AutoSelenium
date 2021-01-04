package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;
import PageObjects.Resetpassword;

public class checkresetpassword_mismatch extends Commonoperations

{
	
	@Test
	public void checkconfirmpasswordfieldpresent()
	{
		//check password and confirm password field not match
		
		PageFactory.initElements(driver, Resetpassword.class);
		Resetpassword.password.sendKeys("password");
		Resetpassword.confirm_password.sendKeys("confirm password");
		String user_text=Resetpassword.error_message.getText();
		Assert.assertEquals(user_text,"Password should match with confirm password.");
		
	}
	
	
}
