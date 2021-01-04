package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class  checkdepartmentdescription_charcaterlength extends Commonoperations

{
	
	
	
	@Test
	public void checkdepartmentdescription_charcaterlength()
	{
		//check department name is empty
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		Adddepartmentobjects.department_description.sendKeys("Department Name Department Name Department Name Department Name");
		Adddepartmentobjects.dep_popup_create.click();
		String user_text=Adddepartmentobjects.name_err.getText();
		Assert.assertEquals(user_text, "Name should not be morethan 150 charcaters");
		
		
	}
	
}