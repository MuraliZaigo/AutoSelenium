package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Resetpassword;

public class checkresetpassword_characters extends Commonoperations

{
	
	@Test
	public void checkconfirmpassword_characters()
	{
		/*check confirm password characters,check special characters ,alphabets and numbers entered in 
		 confirm password field*/
		
		PageFactory.initElements(driver, Resetpassword.class);
		Resetpassword.confirm_password.sendKeys("co12!@");
		String user_text=Resetpassword.error_message.getText();
		Assert.assertEquals(user_text,"co12!@");
		
	}
	
	
}
