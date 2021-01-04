package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class checkTeam_CreateButton extends Commonoperations {
	
	
	
	
	@Test
	public void checkdepartname_Added()
	{
		
		//check the create button exist
		
	PageFactory.initElements(driver, Departmentobjects.class);
	Departmentobjects.click_create_team.click();
	
	PageFactory.initElements(driver, AddTeamObjects.class);
	
	AddTeamObjects.create_btn.getText();
	String user_text=AddTeamObjects.team_name.getText();
	
	Assert.assertEquals(user_text, "Create");
}

}
