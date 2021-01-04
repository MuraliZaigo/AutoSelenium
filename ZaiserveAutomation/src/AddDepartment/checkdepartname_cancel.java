package AddDepartment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;


public class checkdepartname_cancel extends Commonoperations
{
	

@Test
public void checkdepartname_cancel()
{
	//check error message is displayed if the departname is already exist
	
	
	PageFactory.initElements(driver, Adddepartmentobjects.class);
	Adddepartmentobjects.dep_popup_add.click();
	Adddepartmentobjects.department_name.sendKeys("Human Resource");
    Adddepartmentobjects.dep_popup_cancel.click();
	
}
}