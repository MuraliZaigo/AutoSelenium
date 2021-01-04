package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkuseridplaceholder  extends Commonoperations

{
	
	@Test
	public void checkwithplaceholder()
	{
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		String user_text=Loginobjects.userid_lable.getText();
		//System.out.println(user_text);
		Assert.assertEquals(user_text,"User Name");
	}
	
	

}

	
	

