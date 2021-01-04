package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkincorrectuseridcorrectpswd extends Commonoperations

{
	
	@Test
	public void checkincorrectuseridcorrectpswd()
	{
		//check with incorrect user and correct password
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("hello@zai.com");
		Loginobjects.password.sendKeys("correct");
		String err_msg =Loginobjects.email_err.getText();
		Assert.assertEquals(err_msg,"Invalid user id or password");
		
		
	}
	
}

