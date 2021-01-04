package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkcharactersinpasswordfield extends Commonoperations

{
	
	@Test
	public void checkemailformaterror()
	{
		//check alphabets numbers and special characters can entered in the password field.
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.password.sendKeys("abc10!@#");
		String err_msg =Loginobjects.password.getText();
		Assert.assertEquals(err_msg,"abc10!@#");
		
		
	}
	
	
}
