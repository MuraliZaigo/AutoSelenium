package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Forgotpassword;

public class checkforgotpassword_send extends Commonoperations
{
	
	
	@Test
	public void checkpassword_sendbtn()
	{
		//check send btn
		
		PageFactory.initElements(driver, Forgotpassword.class);
		String btn_value= Forgotpassword.send_btn.getText();
		Assert.assertEquals(btn_value,"Send");
		
		
		
		
	}
}