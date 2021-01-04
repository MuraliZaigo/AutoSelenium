package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class checkdescription_placeholder extends Commonoperations {
	
	@Test
	public void checkteam_name_placeholder()
	{
		//check Error Message displayed if the team name is null
		
		PageFactory.initElements(driver, Departmentobjects.class);
		Departmentobjects.click_create_team.click();
		
		PageFactory.initElements(driver, AddTeamObjects.class);
		
		AddTeamObjects.team_name.getAttribute("placeholder");
		
		
		String user_text=AddTeamObjects.team_name_err.getText();
		Assert.assertEquals(user_text, "Team Name");
		
		
	}
	

}
