package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginobjects

{
	
	
WebDriver driver;
		 
		 

		    @FindBy(name="login")
			public static WebElement userName;

		    @FindBy(name="password")
            public static  WebElement password;    

		    @FindBy(xpath="/html/body/div/div/div/div/div/form/div/div[4]/div/a")
		    public static WebElement titleText;

		    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/form/div[4]/button")
		    public static  WebElement login;

		  
		   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/form/div[1]/span")
		   public static  WebElement email_err;
		   
		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement password_w;
		   
		   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/form/div[1]/div/div[1]/label")
		   public static  WebElement  userid_lable;
		   
		 
		   
		   @FindBy(xpath="//*[@id=\'root\']/div/div[2]/div/form/div[2]/div/div[1]/label")
		   public static  WebElement  passwordplaceholder;
		   
		   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/form/div[3]/a/div")
		   public static  WebElement  forgot_password;
		   
		
		   
		   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]")
		   public static  WebElement  loginpassword_err;
		   
		 //*[@id="root"]/div/div[2]/div/form/h5
		   
		   @FindBy(xpath="//*[@id=\'root\']/div/div[2]/div/form/h5")
		   public static  WebElement  login_lable;
		   
		   
		   
		   
		   
		   
		
		

		}
	


