package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;
import PageObjects.Resetpassword;


	
	
	public class  checkresetpassword_password extends Commonoperations

	{
		
		@Test
		public void checkcharacterinpassword()
		{
			//check characters entered in the password field
			
			PageFactory.initElements(driver, Resetpassword.class);
			Resetpassword.password.sendKeys("co!@123");
			String user_text=Loginobjects.password.getText();
			Assert.assertEquals(user_text,"co!@123" );
			//add new feature
			
		}
		
		
	}


