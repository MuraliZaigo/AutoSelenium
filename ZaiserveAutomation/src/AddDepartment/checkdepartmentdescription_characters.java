package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class checkdepartmentdescription_characters extends Commonoperations {
	
	
	@Test
	public void checkdepartname_empty()
	{
		/*check the all type of characters can be entered in the 
		description field*/
		
		
		
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		Adddepartmentobjects.department_description.sendKeys("des 123 !@$");
		String user_text=Adddepartmentobjects.department_description.getText();
		Assert.assertEquals(user_text, "Description");
		
		
	}

}