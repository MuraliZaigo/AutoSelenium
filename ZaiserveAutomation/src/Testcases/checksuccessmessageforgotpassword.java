package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checksuccessmessageforgotpassword extends Commonoperations

{
	
	@Test
	public void checkforgotpassword_succesmessage()
	{
		//check the password field is present.
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.password.sendKeys("password");
		String user_text=Loginobjects.userName.getText();
		Assert.assertEquals(user_text,"password" );
		
	}
	
	
}


