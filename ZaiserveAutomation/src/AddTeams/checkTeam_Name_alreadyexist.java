package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class checkTeam_Name_alreadyexist extends Commonoperations {
	
	@Test
	public void checkdepartname_Added()
	{
		//check Error Message displayed if the team name is already exist
		//team name already exist
		
		PageFactory.initElements(driver, Departmentobjects.class);
		Departmentobjects.click_create_team.click();
		
		PageFactory.initElements(driver, AddTeamObjects.class);
		
		AddTeamObjects.team_name.sendKeys("Already exist");
		AddTeamObjects.create_btn.click();
		String user_text=AddTeamObjects.name_err.getText();
		
		Assert.assertEquals(user_text, "Team Name already exist");
		
		
	}


}
