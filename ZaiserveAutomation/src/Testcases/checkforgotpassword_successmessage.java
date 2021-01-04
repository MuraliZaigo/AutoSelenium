package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Forgotpassword;

public class checkforgotpassword_successmessage extends Commonoperations{
	
	
	@Test
	public void checkemailnotexist()
	{
		//check success message
		
		PageFactory.initElements(driver, Forgotpassword.class);
		Forgotpassword.Email.sendKeys("validemail@zaiserve.com");
		String Err_msg= Forgotpassword.err_msg.getText();
		Assert.assertEquals(Err_msg,"verification Link Send to Your Email");
		
		
		
		
	}
	
	
}
