package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkwithcorrectuseridandpassword extends Commonoperations

{
	
	@Test
	public void checkwithuserfieldempryspaces()
	{
		//check with correct ui and correct password
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("hello@");
		Loginobjects.password.sendKeys("nhjm");
		String dashboard_url= driver.getCurrentUrl();
		Assert.assertEquals(dashboard_url,"http://dev.zaicrm.com/#/");
	}
}