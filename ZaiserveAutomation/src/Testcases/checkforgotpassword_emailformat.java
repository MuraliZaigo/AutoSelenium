package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Forgotpassword;

public class checkforgotpassword_emailformat extends Commonoperations

{
	
	@Test
	public void checkerrormsg_emailformat()
	{
		//check email is in format
		
		PageFactory.initElements(driver, Forgotpassword.class);
		Forgotpassword.Email.sendKeys("john@zai");
		String err_msg= Forgotpassword.err_msg.getText();
		Assert.assertEquals(err_msg,"Enter a valid e-mail address");
		
		
	}
	
	
}
