package Connect.TestScripts;

import org.testng.annotations.Test;

import Connect.General.ConnectBaseSetup;

public class SpeechTestScript extends ConnectBaseSetup {			

	@SuppressWarnings("static-access")
	@Test // TestID01
	public void Speech_Now_InClass_On_On_On_EveryOne() throws InterruptedException  
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");
		
		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	
		
		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	
		
		String show_comments_and_rubric_to = "EveryOne";
		
		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	
				
		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}
	
	@SuppressWarnings("static-access")
	@Test // TestID02
	public void Speech_Now_InClass_On_On_On_SpeakerandInstructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");
		
		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	
		
		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	
		
		String show_comments_and_rubric_to = "SpeakerandInstructor";
		
		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	
				
		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}
	
	@SuppressWarnings("static-access")
	@Test // TestID03
	public void Speech_Now_InClass_On_On_On_Instructor() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");
		
		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	
		
		String AvailableType = "NOW";
		String SpeechType = "InClass";
		waitforApge();	
		
		String show_comments_and_rubric_to = "Instructor";
		
		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	
				
		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}
	
	@SuppressWarnings("static-access")
	@Test // TestID09
	public void Speech_Now_Online_On_On_On_EveryOne() throws InterruptedException
	{		
		loginPage.CheckLoginWithValidCred("mahadev@gmail.com", "123456");
		Log.info("Login with Valid Credentials Test case completed");
		
		Thread.sleep(2000);
		selectsection.navigatetosection();		
		Thread.sleep(5000);					
		Log.info("Successfully Navigated to section");	
		waitforApge();	
		
		String AvailableType = "NOW";
		String SpeechType = "Online";
		waitforApge();	
		
		String show_comments_and_rubric_to = "EveryOne";
		
		SpeechCreate.CreateSpeeachAssignment(AvailableType, SpeechType, true, true, true, show_comments_and_rubric_to);	
				
		waitforApge();			
		logoutPage.ClickonLogoutButton();
		waitforApge();			
	}
	
	
}