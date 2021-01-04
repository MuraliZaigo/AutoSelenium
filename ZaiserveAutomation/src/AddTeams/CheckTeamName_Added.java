package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;
import PageObjects.Loginobjects;

public class CheckTeamName_Added extends Commonoperations {
	
	
	
		public  void login()
		{
			//method for login
			PageFactory.initElements(driver,Loginobjects.class);
			Loginobjects.userName.sendKeys("admin@zaigoinfotech.com");
			Loginobjects.password.sendKeys("1234567890");
			Loginobjects.login.click();
			
		}
	
	
	
	@Test
	public void checkteamname_Alphabets()
	{
		//ensure the team name added successfully
		
		login();
		
		PageFactory.initElements(driver, Departmentobjects.class);
		Departmentobjects.click_create_team.click();
		
		PageFactory.initElements(driver, AddTeamObjects.class);
		
		AddTeamObjects.team_name.sendKeys("Abcdefghijk");
		AddTeamObjects.create_btn.click();
		String user_text=AddTeamObjects.team_name.getText();
		
		Assert.assertEquals(user_text, "Abcdefghijk");
		
		
	}
}