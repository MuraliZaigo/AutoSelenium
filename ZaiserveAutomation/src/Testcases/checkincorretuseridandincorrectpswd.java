package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;


	public class checkincorretuseridandincorrectpswd extends Commonoperations

	{
		
		@Test
		public void checkwithuserfieldempryspaces()
		{
			//check with incorrect ui and incorrect password
			
			
			PageFactory.initElements(driver, Loginobjects.class);
			Loginobjects.userName.sendKeys("hello@mjm.in");
			Loginobjects.password.sendKeys("nhjm");
			String user_text= Loginobjects.email_err.getText();
			Assert.assertEquals(user_text,"Invalid email or password");
		}
	}
	
	

