package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;

public class  checkdepartdescription_withspecialcharacters extends Commonoperations

{
	
	
	
	@Test
	public void checkdepartdescription_withspecialcharcters()
	{
		//check error message is displayed if the departname is in special characters
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.dep_popup_add.click();
		Adddepartmentobjects.department_description.sendKeys("Department description with special chracters @#$");
	    Adddepartmentobjects.dep_popup_create.click();
	    String user_text=Adddepartmentobjects.description_err.getText();
		Assert.assertEquals(user_text, "");
		
		
	}
	
}
