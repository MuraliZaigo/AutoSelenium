package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;


	
	public class checkloginbtnpresent extends Commonoperations

	{
		
		@Test
		public void checkloginbuttonpresent()
		{
			//check Login btn is present
			
			PageFactory.initElements(driver, Loginobjects.class);
			String loginbtn= Loginobjects.login.getText();
			Assert.assertEquals(loginbtn, "Login");
			
			
		}
		
		
	}


