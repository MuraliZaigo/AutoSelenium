package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class checkdepartment_description_placeholder extends Commonoperations {
	
	@Test
	public void checkdepartname_fieldexist()
	{
		//check department name is empty
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		String user_text=Adddepartmentobjects.department_description.getAttribute("placeholder");
		Assert.assertEquals(user_text, "Description(optional)");
		
		
	}

}
