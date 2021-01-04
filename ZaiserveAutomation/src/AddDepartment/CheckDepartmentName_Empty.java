package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;
import PageObjects.Loginobjects;
import PageObjects.Resetpassword;

public class  CheckDepartmentName_Empty extends Commonoperations

{
	
	public  void login()
	{
		//method for login
		PageFactory.initElements(driver,Loginobjects.class);
		Loginobjects.userName.sendKeys("admin@zaigoinfotech.com");
		Loginobjects.password.sendKeys("1234567890");
		Loginobjects.login.click();
		
	}
	
	@Test
	public void checkdepartname_empty()
	{
		//check department name is empty
		//department name should be mandatory
		
		login();
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		String user_text=Adddepartmentobjects.name_err.getText();
		Assert.assertEquals(user_text, "Enter the Department Name");
		
		
	}
	
}