package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;
import PageObjects.Resetpassword;

public class checkresetpassword_confirmpasswordexist extends Commonoperations

{
	
	@Test
	public void checkconfirmpasswordfieldpresent()
	{
		//check confirm password field exist
		
		PageFactory.initElements(driver, Resetpassword.class);
		Resetpassword.confirm_password.sendKeys("confirm password");
		String user_text=Loginobjects.password.getText();
		Assert.assertEquals(user_text,"confirm password" );
		
	}
	
	
}
