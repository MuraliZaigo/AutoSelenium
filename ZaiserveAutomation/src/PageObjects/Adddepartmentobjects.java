package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adddepartmentobjects 
{
	
	
	WebDriver driver;
	 
	//added dummy locators .
	 
	 @FindBy(name="department_btn")
		public static  WebElement Add_department;

    @FindBy(name="department_name")
	public static  WebElement department_name;
    @FindBy(name="err_msg")
    public static WebElement name_err;

   @FindBy(name="department_description")
   public static WebElement department_description;
   @FindBy(name="department_description")
   public static WebElement description_err;
   
   @FindBy(name="department_pop")
   public static WebElement dep_popup_close;
   
   @FindBy(name="department_pop")
   public static WebElement dep_popup_add;
   
   @FindBy(name="department_pop")
   public static WebElement dep_popup_cancel;
   
   @FindBy(name="create_popup")
   public static WebElement dep_popup_create;
   
   
   @FindBy(name="department_lable")
   public static WebElement department_lable;
   
   @FindBy(name="success")
   public static WebElement suc_msg;
   
   
   
   
   


}



