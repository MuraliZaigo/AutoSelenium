package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resetpassword


{
	
	
	WebDriver driver;
		 
		 

		    @FindBy(name="password")
			public static  WebElement password;

		    @FindBy(name="confirm_password")
            public static  WebElement confirm_password;    

		    @FindBy(xpath="/html/body/div/div/div/div/div/form/div/div[4]/div/a")
		    public static WebElement error_message;

		    @FindBy(tagName="button")
		    public static  WebElement reset;

		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement Resetpassword_err;

		   
		   
}