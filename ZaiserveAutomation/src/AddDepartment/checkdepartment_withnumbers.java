package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class  checkdepartment_withnumbers extends Commonoperations

{
	
	
	
	@Test
	public void checkdepartname_numbers()
	{
		//check the department name cam be in numbers
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		Adddepartmentobjects.department_name.sendKeys("1234567890");
	    Adddepartmentobjects.dep_popup_create.click();
	    String user_text=Adddepartmentobjects.name_err.getText();
		Assert.assertEquals(user_text, "Enter valid Name");
		
		
	}
	
}
