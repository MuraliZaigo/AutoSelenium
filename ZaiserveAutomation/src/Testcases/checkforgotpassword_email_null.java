package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Forgotpassword;
import PageObjects.Loginobjects;

public class checkforgotpassword_email_null extends Commonoperations

{
	
	@Test
	public void checkerrormsg_emailnull()
	{
		//check email is null
		
		driver.get("http://dev.zaicrm.com/#/forgot-password");
		
		PageFactory.initElements(driver, Forgotpassword.class);
		
		Forgotpassword.Email.sendKeys("");
		Forgotpassword.send_btn.click();
		String err_msg= Forgotpassword.err_msg.getText();
		Assert.assertEquals(err_msg,"Enter a valid e-mail address");
		
		
	}
	
	
}