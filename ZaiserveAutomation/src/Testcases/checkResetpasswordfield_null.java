package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Resetpassword;

public class checkResetpasswordfield_null extends Commonoperations

{
	
	@Test
	public void checkcResetpassword_empty()
	{
		//check error message displayed if the new password field is empty
		
		PageFactory.initElements(driver, Resetpassword.class);
		Resetpassword.password.sendKeys("");
		String user_text=Resetpassword.error_message.getText();
		Assert.assertEquals(user_text,"Enter the New password");
		
	}
	
	
}
