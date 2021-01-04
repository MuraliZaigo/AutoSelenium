package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkcinputtype extends Commonoperations

{
	
	@Test
	public void checkemailformaterror()
	{
		//check password field is encrypted
		
		PageFactory.initElements(driver, Loginobjects.class);
		String sc=Loginobjects.password.getAttribute("type");
		Assert.assertEquals(sc,"password");
		
		
	}
	
	
}
