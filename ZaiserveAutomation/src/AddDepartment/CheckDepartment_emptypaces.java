package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;
import PageObjects.Loginobjects;

public class  CheckDepartment_emptypaces extends Commonoperations

{
	
	
	
	@Test
	public void checkdepartname_emptyspaces()
	{
		//check department name is emptyspaces
		
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.department_name.sendKeys("    ");
		Adddepartmentobjects.dep_popup_add.click();
		String user_text=Adddepartmentobjects.name_err.getText();
		Assert.assertEquals(user_text, "Enter the Department Name");
		
		
	}
	
}
