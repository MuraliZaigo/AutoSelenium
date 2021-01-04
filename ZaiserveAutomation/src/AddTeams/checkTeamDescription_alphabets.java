package AddTeams;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Commonuntions.Commonoperations;
import PageObjects.AddTeamObjects;
import PageObjects.Departmentobjects;
import PageObjects.Loginobjects;

public class checkTeamDescription_alphabets extends Commonoperations 
{
	
	public  void login()
	{
		//method for login
		PageFactory.initElements(driver,Loginobjects.class);
		Loginobjects.userName.sendKeys("admin@zaigoinfotech.com");
		Loginobjects.password.sendKeys("1234567890");
		Loginobjects.login.click();
		
	}
	
	public void checkteamdescription_alphabets()
	{
		
		//check the team description with alphabets
		
		login();
		
	PageFactory.initElements(driver, Departmentobjects.class);
	Departmentobjects.click_create_team.click();
	
	PageFactory.initElements(driver, AddTeamObjects.class);
	
	AddTeamObjects.team_desc.sendKeys("Description alphabets");
	String user_text=AddTeamObjects.team_desc.getText();
	
    Assert.assertEquals(user_text, "Description alphabets");
	
	
	
}

}
