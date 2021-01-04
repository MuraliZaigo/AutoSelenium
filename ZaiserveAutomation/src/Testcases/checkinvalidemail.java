package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkinvalidemail extends Commonoperations {
	
	
	@Test
	public void checkwithinvalidemailid()
	{
		//check with invalid email id.
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("hell0");
		Loginobjects.login.click();
		String user_text=Loginobjects.email_err.getText();
		Assert.assertEquals(user_text,"Enter a valid e-mail address");
	}
	
	

}
