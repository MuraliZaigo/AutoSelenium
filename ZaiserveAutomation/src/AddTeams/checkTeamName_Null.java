package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Adddepartmentobjects;
import PageObjects.Departmentobjects;

public class checkTeamName_Null extends Commonoperations {

	
	@Test
	public void checkdepartname_Added()
	{
		//check Error Message displayed if the team name is null
		
		PageFactory.initElements(driver, Departmentobjects.class);
		Departmentobjects.click_create_team.click();
		
		PageFactory.initElements(driver, AddTeamObjects.class);
		
		AddTeamObjects.team_name.sendKeys("");
		AddTeamObjects.create_btn.click();
		
		String user_text=AddTeamObjects.team_name_err.getText();
		Assert.assertEquals(user_text, "Enter the Team Name");
		
		
	}
	
}
