package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkwithnulluseridnullpassword extends Commonoperations

{
	
	@Test
	public void checkwithuserfieldempryspaces()
	{
		//check with null user id and null password
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("");
		Loginobjects.password.sendKeys("");
		Loginobjects.login.click();
		String user_text=Loginobjects.email_err.getText();
		Assert.assertEquals(user_text,"Enter your e-mail");
	}
	
	
}

