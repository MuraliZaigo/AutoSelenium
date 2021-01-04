package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class checkdepartment_Added_SuccessMessage extends Commonoperations 
{

    @Test
	public void checkdepartname_emptyspaces()
	{
		//check department name is emptyspaces
		
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.department_name.sendKeys("Enter Department Name");
		Adddepartmentobjects.dep_popup_add.click();
		String user_text=Adddepartmentobjects.suc_msg.getText();
		Assert.assertEquals(user_text, "1 Department Added Successfully");
		
		
	}
	
}

