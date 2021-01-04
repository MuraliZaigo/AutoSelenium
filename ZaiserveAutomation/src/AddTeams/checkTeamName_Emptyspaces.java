package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class checkTeamName_Emptyspaces extends Commonoperations {
	
	
	@Test
	public void checkdepartname_Added()
	
	{
		//check the team name with empty spaces
		
		PageFactory.initElements(driver, Departmentobjects.class);
		Departmentobjects.click_create_team.click();
		
		PageFactory.initElements(driver, AddTeamObjects.class);
		
		AddTeamObjects.team_name.sendKeys("      ");
		String user_text=AddTeamObjects.team_name.getText();
		Assert.assertEquals(user_text, "Enter the valid team name");
		
		
	}


}
