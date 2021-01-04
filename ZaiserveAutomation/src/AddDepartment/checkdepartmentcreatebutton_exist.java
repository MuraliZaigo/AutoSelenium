package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class checkdepartmentcreatebutton_exist extends Commonoperations {
	
	
	@Test
	public void checkdepartcreate_btn_exist()
	{
		//check the create button is present
		
		
		
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		String user_text=Adddepartmentobjects.dep_popup_create.getText();
		Assert.assertEquals(user_text, "create");
		
		
	}
}