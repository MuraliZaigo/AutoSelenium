package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class checkTeamDescription_characterlength extends Commonoperations {
	
	public void checkteamdescription_alphnumerics()
	{
		
		//check the team description ,character length
		
	PageFactory.initElements(driver, Departmentobjects.class);
	Departmentobjects.click_create_team.click();
	
	PageFactory.initElements(driver, AddTeamObjects.class);
	
	AddTeamObjects.team_desc.sendKeys("abcdefgh123456abcdefgh12345abcdefgh12345abcdefgh12345abcdefgh12345abcdefgh12345");
	String user_text=AddTeamObjects.team_desc.getText();
	Assert.assertEquals(user_text, "Description Must be less than 200 characters");
}
}
