package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkeorrectuidandincorrectpassword extends Commonoperations

{
	
	@Test
	public void checkcorrectuidandincorrectpassword()
	{
		//check with correct uid and incorrect password
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("hello@");
		Loginobjects.password.sendKeys("nhjm");
		String err_msg =Loginobjects.email_err.getText();
		Assert.assertEquals(err_msg,"Enter a valid e-mail address");
		
		
	}
	
	
}
