package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class  checkdepartment_added extends Commonoperations

{
	
	
	
	@Test
	public void checkdepartname_Added()
	{
		//check error message is displayed if the departname is already exist
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		Adddepartmentobjects.department_name.sendKeys("Human Resource");
	    Adddepartmentobjects.dep_popup_create.click();
	    String user_text=Adddepartmentobjects.suc_msg.getText();
		Assert.assertEquals(user_text, "Added Successfully");
		
		
	}
	
}


