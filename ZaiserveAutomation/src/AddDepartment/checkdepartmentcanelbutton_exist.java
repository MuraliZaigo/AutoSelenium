package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class checkdepartmentcanelbutton_exist extends Commonoperations {
	
	
	@Test
	public void checkdepartcancel_btn_exist()
	{
		//check the department description field is present
		
		
		
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		String user_text=Adddepartmentobjects.dep_popup_cancel.getText();
		Assert.assertEquals(user_text, "cancel");
		
		
	}
}