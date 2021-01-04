package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;

public class CheckTeamName_Alphabets extends Commonoperations {
	
	@Test
	public void checkteamname_Alphabets()
	{
		//ensure the error method is not displayed
		
		PageFactory.initElements(driver, Departmentobjects.class);
		Departmentobjects.click_create_team.click();
		
		PageFactory.initElements(driver, AddTeamObjects.class);
		
		AddTeamObjects.team_name.sendKeys("Abcdefghijk");
		AddTeamObjects.create_btn.click();
		String user_text=AddTeamObjects.name_err.getText();
		
		Assert.assertEquals(user_text, "Abcdefghijk");
		
		
	}


}



