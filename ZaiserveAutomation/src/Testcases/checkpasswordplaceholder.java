package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkpasswordplaceholder extends Commonoperations {
	
	@Test
	public void checkpasswordplaceholder()
	{
		//check password placeholder is present
		
		PageFactory.initElements(driver, Loginobjects.class);
		String user_text=Loginobjects.passwordplaceholder.getText();
		System.out.println(user_text);
		Assert.assertEquals(user_text,"Password");
		
		
	}

}
