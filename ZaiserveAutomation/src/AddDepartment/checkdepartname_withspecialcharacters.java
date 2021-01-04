




package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class  checkdepartname_withspecialcharacters extends Commonoperations

{
	
	
	
	@Test
	public void checkdepartname_withspecialcharcters()
	{
		//check error message is displayed if the departname is in special characters
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		Adddepartmentobjects.department_name.sendKeys("$rm@n@geR");
	    Adddepartmentobjects.dep_popup_create.click();
	    String user_text=Adddepartmentobjects.name_err.getText();
		Assert.assertEquals(user_text, "Entered Departname name is  Already Exist");
		
		
	}
	
}