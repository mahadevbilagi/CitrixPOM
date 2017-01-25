package Connect.TestScripts;

import org.junit.Test;

import Connect.General.ConnectBaseSetup;

public class WebActivityTestScript extends ConnectBaseSetup {			

	//@SuppressWarnings("static-access")
	@Test (invocationCount=1)
	public void WebActivityCreate() throws InterruptedException
	{	
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");
		
		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");		
		
		WebActivityCreate.CreateWebActivityAssignment();		
		Log.info("Web Activity Assignment created successfully! ");
		
		waitforApge();			
		logoutPage.ClickonLogoutButton();		
		
		waitforApge();			
	}		
}