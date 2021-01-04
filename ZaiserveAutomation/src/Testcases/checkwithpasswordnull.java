package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkwithpasswordnull extends Commonoperations

{
	
	@Test
	public void checkwithusernameempty()
	{
		//check with password null
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.password.sendKeys("");
		Loginobjects.login.click();
		String user_text=Loginobjects.password_w.getText();
		Assert.assertEquals(user_text,"Enter your e-mail");
	}
	
	
}

