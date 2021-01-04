package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTeamObjects {
	
	
	WebDriver driver;
	 
	 

    @FindBy(name="name")
	public static  WebElement team_name;
    
    @FindBy(name="team_name_err")
	public static  WebElement team_name_err;

    @FindBy(name="departmentname")
    public static WebElement team_desc;
   
   
   @FindBy(name="name_err")
   public static WebElement name_err;

   @FindBy(name="create_btn")
   public static WebElement create_btn;
   
   @FindBy(name="close_btn")
   public static WebElement close_btn;
   
   @FindBy(name="cancel_btn")
   public static WebElement cancel_btn;


}

