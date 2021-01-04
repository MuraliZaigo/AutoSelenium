package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class CheckTeamName_Exist extends Commonoperations{
	
	@Test
	public void checkdepartname_Added()
	{
		//check the name field exist
		
		PageFactory.initElements(driver, Departmentobjects.class);
		Departmentobjects.click_create_team.click();
		
		PageFactory.initElements(driver, AddTeamObjects.class);
		
		AddTeamObjects.team_name.sendKeys("Team Name");
		String user_text=AddTeamObjects.team_name.getText();
		
		
		Assert.assertEquals(user_text, "Team Name");
		
		
	}

}
