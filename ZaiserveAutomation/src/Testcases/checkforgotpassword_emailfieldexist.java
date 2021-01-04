package Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Forgotpassword;
import PageObjects.Loginobjects;

public class checkforgotpassword_emailfieldexist extends Commonoperations

{
	
	@Test
	public void checkemailformaterror()
	{
		//check email field is present in the forgot password page
		
		PageFactory.initElements(driver, Forgotpassword.class);
		
		Forgotpassword.Email.sendKeys("hello");
		String hello= Forgotpassword.Email.getText();
		Assert.assertEquals(hello,"hello");
		
		
		
	}
	
}
