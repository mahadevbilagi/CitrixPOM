package Connect.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Connect.General.FFConnectBaseSetup;
import Connect.PageFactory.LoginPage;
import Connect.PageFactory.LogoutPage;

public class MyTestScripts extends FFConnectBaseSetup {		
	
	@Test 
	public void LoginwithValidCredentials()
	{	
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		LogoutPage logoutPage = PageFactory.initElements(driver, LogoutPage.class);		
		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitforApge();			
		logoutPage.ClickonLogoutButton();			
		waitforApge();				
		Log.info("LoginwithValidCredentials Test case completed");
		
	}
	
	/*@Test 
	public void LoginwithInValidCredentialsPasswordandEmail()
	{		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.CheckLoginWithInValidCred("mahadev1234@gmail.com", "12345ad6");	
		Log.info("LoginwithInValidCredentialsPasswordandEmail Test case completed");
				
	}
	
	@Test 
	public void LoginwithInValidCredentialsEmail()
	{		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.CheckLoginWithInValidCred("mahadev1234@gmail.com", "123456");		
		Log.info("LoginwithInValidCredentialsEmail Test case completed");
	}
	
	@Test 
	public void LoginwithInValidCredentialsPassword()
	{		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.CheckLoginWithInValidCred("mahadev@gmail.com", "123456ABC");	
		Log.info("LoginwithInValidCredentialsPassword Test case completed");
	}	
	*/
}