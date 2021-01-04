package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkwithvalidemail extends Commonoperations

{
	
	@Test
	public void checkwithvalidemailid()
	{
		//check with valid email id,and error message should not displayed
		
		
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("hell0@gmail.com");
		Loginobjects.login.click();
		boolean actual_res=Loginobjects.email_err.isDisplayed();
		Assert.assertEquals(actual_res, false);
	}
	
	
}
