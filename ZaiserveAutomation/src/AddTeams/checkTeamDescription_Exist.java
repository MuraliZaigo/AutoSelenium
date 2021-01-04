package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class checkTeamDescription_Exist extends Commonoperations {

	
	@Test
	public void checkdepartname_Added()
	{
		
		//check department field is present in the popup
		
	PageFactory.initElements(driver, Departmentobjects.class);
	Departmentobjects.click_create_team.click();
	
	PageFactory.initElements(driver, AddTeamObjects.class);
	
	AddTeamObjects.team_desc.sendKeys("Team Description");
	String user_text=AddTeamObjects.team_name.getText();
	
	
	Assert.assertEquals(user_text, "Team Description");
}
}