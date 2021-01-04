package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class checkTeamDescription_alphanumeric extends Commonoperations {
	
	public void checkteamdescription_alphnumerics()
	{
		
		//check the team description with alphanumeric characters
		
	PageFactory.initElements(driver, Departmentobjects.class);
	Departmentobjects.click_create_team.click();
	
	PageFactory.initElements(driver, AddTeamObjects.class);
	
	AddTeamObjects.team_desc.sendKeys("abcdefgh123456");
	String user_text=AddTeamObjects.team_desc.getText();
	
	
	Assert.assertEquals(user_text, "");
}
}