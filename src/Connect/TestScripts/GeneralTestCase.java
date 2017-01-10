package Connect.TestScripts;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.log.Log;
import org.testng.annotations.Test;

import Connect.General.ConnectBaseSetup;

public class GeneralTestCase extends ConnectBaseSetup {		
	
			@Test 
			public void LoginwithValidCredentials()
			{			
				loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				waitforApge();			
				logoutPage.ClickonLogoutButton();			
				waitforApge();				
				Log.info("Login with Valid Credentials Test case completed");
				
			}

			private void waitforApge() {
				// TODO Auto-generated method stub
				
			}	
			
	/*		@Test 
			public void LoginwithInValidCredentialsPasswordandEmail()
			{					
				loginPage.CheckLoginWithInValidCred("mahadev1234@gmail.com", "12345ad6");	
				Log.info("LoginwithInValidCredentialsPasswordandEmail Test case completed");
						
			}
			
			@Test 
			public void LoginwithInValidCredentialsEmail()
			{			
				loginPage.CheckLoginWithInValidCred("mahadev1234@gmail.com", "123456");		
				Log.info("LoginwithInValidCredentialsEmail Test case completed");
			}
			
			@Test 
			public void LoginwithInValidCredentialsPassword()
			{		
			
				loginPage.CheckLoginWithInValidCred("mahadev@gmail.com", "123456ABC");	
				Log.info("LoginwithInValidCredentialsPassword Test case completed");
			}		
			
			@Test 
			public void CheckHelpLink()
			{	
					
				loginPage.CheckHelpLink();			
				waitforApge();		
			}
			
			@Test 
			public void navigatetosection() throws InterruptedException
			{			
				loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");			
				Log.info("LoginwithValidCredentials Test case completed");
				Thread.sleep(2000);
				Selectsection.navigatetosection();		
				Thread.sleep(5000);			
				
				Log.info("Successfully Navigated to section");		
				
				waitforApge();			
				logoutPage.ClickonLogoutButton();			
				waitforApge();			
			}		*/
			
}