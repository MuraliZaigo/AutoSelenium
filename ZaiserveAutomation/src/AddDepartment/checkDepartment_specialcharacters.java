package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class  checkDepartment_specialcharacters extends Commonoperations

{
	
	
	
	@Test
	public void checkdepartname_Added()
	{
		//check the department can be created with special characters
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		Adddepartmentobjects.department_name.sendKeys("!@#_!##");
	    Adddepartmentobjects.dep_popup_create.click();
	    String user_text=Adddepartmentobjects.name_err.getText();
		Assert.assertEquals(user_text, "Enter valid Name");
		
		
	}
	
}
