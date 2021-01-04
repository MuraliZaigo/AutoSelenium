package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Departmentobjects 

         {
	
	WebDriver driver;
	
	
	 
		   @FindBy(name="depar")
		   public static  WebElement department;
		    
           @FindBy(name="department_click")
		   public static WebElement department_click;
           
           @FindBy(xpath="//*[@id=\'team\']/g/g[1]/rect[1]")
           public static WebElement click_create_team;
           
           @FindBy(xpath="//*[@id=\'team\']/g/g[1]/rect[1]")
           public static WebElement team_added_msg;
 		  
           }
