package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;




public class checkuserfieldpresent extends Commonoperations

{
	
	@Test
	public void checkuserfieldpresent()
	{
		//check the user field is present
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("hell0@gmail.com");
		String user_text=Loginobjects.userName.getAttribute("value");
		Assert.assertEquals(user_text,"hell0@gmail.com" );
		
	}
	
	
}
