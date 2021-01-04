package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Resetpassword;

public class checkresetpassword_confirmpassword_null extends Commonoperations

{
	
	@Test
	public void checkconfirmpassword_null()
	{
		
		
		PageFactory.initElements(driver, Resetpassword.class);
		Resetpassword.confirm_password.sendKeys("");
		Resetpassword.reset.click();
		String user_text=Resetpassword.error_message.getText();
		Assert.assertEquals(user_text,"Enter the Confirm password");
		
	}
	
	
}

