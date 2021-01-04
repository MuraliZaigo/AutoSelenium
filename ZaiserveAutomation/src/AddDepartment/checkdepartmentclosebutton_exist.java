package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class checkdepartmentclosebutton_exist extends Commonoperations {
	
	
	@Test
	public void checkdepartcancel_btn_exist()
	{
		//check the close button exist 
		
		
		
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
	    String user_text=	Adddepartmentobjects.dep_popup_close.getText();
		Assert.assertEquals(user_text, "X");
		
		
	}
}