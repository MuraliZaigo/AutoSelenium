package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;
import PageObjects.Resetpassword;

public class checkresetpassword_passwordfieldexist extends Commonoperations

{
	
	@Test
	public void checkpasswordfieldpresent()
	{
		//check password field is present
		
		PageFactory.initElements(driver, Resetpassword.class);
		Loginobjects.password.sendKeys("password");
		String user_text=Loginobjects.password.getText();
		Assert.assertEquals(user_text,"password" );
		
	}
	
	
}

