package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class checkTeamName_Alphanumeric extends Commonoperations{
	
	@Test
	public void checkTeamName_Alphanumeric()
	{
		//check error  message displayed if the departname is alphanumeric
		
		PageFactory.initElements(driver, Departmentobjects.class);
		Departmentobjects.click_create_team.click();
		
		PageFactory.initElements(driver, AddTeamObjects.class);
		
		AddTeamObjects.team_name.sendKeys("abcdef123456");
		AddTeamObjects.create_btn.click();
		
		String user_text=AddTeamObjects.team_name_err.getText();
		Assert.assertEquals(user_text, "Enter the valid Team Name");
		
		
	}
}
