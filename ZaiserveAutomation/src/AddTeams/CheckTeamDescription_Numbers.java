package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class CheckTeamDescription_Numbers extends Commonoperations {
	
	public void checkteamdescription_numbers()
	{
		
		//check the team description with numbers
		
	PageFactory.initElements(driver, Departmentobjects.class);
	Departmentobjects.click_create_team.click();
	
	PageFactory.initElements(driver, AddTeamObjects.class);
	
	AddTeamObjects.team_desc.sendKeys("12334567890");
	String user_text=AddTeamObjects.team_desc.getText();
	
	
	Assert.assertEquals(user_text, "");
}

}
