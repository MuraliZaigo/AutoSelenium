package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Forgotpassword;
import PageObjects.Loginobjects;

public class checkforgotpassword_LoginLink extends Commonoperations
{
	
	
	@Test
	public void checkemailnotexist() throws InterruptedException
	{
		//check Link for the Login page in forgotpassword page
		driver.get("http://dev.zaicrm.com/#/forgot-password");
		
	
		PageFactory.initElements(driver, Forgotpassword.class);
		Forgotpassword.login_link.click();
		String text=driver.getCurrentUrl();
		Assert.assertEquals(text,"http://dev.zaicrm.com/#/");
		
		
		
		
	}
	
	

}
