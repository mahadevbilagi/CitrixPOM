package Connect.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Connect.General.FFConnectBaseSetup;

public class LoginPage extends FFConnectBaseSetup {	
	
	@FindBy(id = "userName")
	WebElement UserName;
	 
	@FindBy(id = "password")
	WebElement Password;
	 
	@FindBy(xpath = "//input[@value='Sign in']")					 
	WebElement SignInButton;
		 
	@FindBy( id = "clientFormError")
	WebElement ErrorMessage;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	 
	public LoginPage EnterUsername(String username) {
		UserName.click();
		Log.info("UserName field found");
		UserName.sendKeys(username);
		return PageFactory.initElements(driver, LoginPage.class);
	}

	public LoginPage EnterPassword(String password) {
		Password.click();
		Log.info("Password field found");
		Password.sendKeys(password);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public LoginPage ClickonSigninButton() {
		SignInButton.click();		
		Log.info("SignInButton found");
		return PageFactory.initElements(driver, LoginPage.class);
	}	
	
	public LoginPage CheckLoginWithValidCred(String Username, String PassWord)
	{
		UserName.sendKeys(Username);
		Log.info("UserName field found");
		Password.sendKeys(PassWord);
		Log.info("Password field found");
		SignInButton.click();	
		Log.info("SignInButton found");
		waitforApge();		
		return PageFactory.initElements(driver, LoginPage.class);		
	}
	
	public LoginPage CheckLoginWithInValidCred(String Username, String PassWord)
	{
		UserName.sendKeys(Username);
		Log.info("UserName field found");
		Password.sendKeys(PassWord);
		Log.info("Password field found");
		SignInButton.click();		
		Log.info("SignInButton found");
		if(ErrorMessage.isDisplayed())
		{		
			System.out.println("Login Failed!");
		}
		return PageFactory.initElements(driver, LoginPage.class);		
	}	
		
}