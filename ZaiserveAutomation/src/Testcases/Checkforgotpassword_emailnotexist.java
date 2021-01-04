package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Forgotpassword;

public class Checkforgotpassword_emailnotexist extends Commonoperations{
	
	
	@Test
	public void checkemailnotexist()
	{
		//check email not exist
		
		PageFactory.initElements(driver, Forgotpassword.class);
		Forgotpassword.Email.sendKeys("notexist@zaiserve.com");
		String Err_msg= Forgotpassword.err_msg.getText();
		Assert.assertEquals(Err_msg,"Email not exist");
		
		
		
		
	}
	
	

}
