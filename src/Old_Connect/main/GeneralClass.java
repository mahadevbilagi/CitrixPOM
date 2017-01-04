package Old_Connect.main;

import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Old_Connect.login.Login;
import Old_Connect.logout.Logout;

public class GeneralClass {
	
public static void main(String[] args) throws InterruptedException {		

//public class ConnectRegistrationTest {	
	//WebDriver Wd = new FirefoxDriver();		
	// @Test //This is TestNG annotation	
	
	// public void ConnecttestRegister() throws InterruptedException{		
		
	
			WebDriver Wd = new FirefoxDriver();		
			Wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);     // Implicit wait 60 Sec 
		
			Login lg = new Login();	
			lg.Login(Wd);
			System.out.println("Login Succussful !..");				
			
	 		/*Selectsection Sa = new Selectsection();			
	 		Sa.Selectsection(Wd);											// Create New Course
			System.out.println("Navigated to section successfully!..");		
			
			Webactivity Wa = new Webactivity();	
			Wa.Webactivity(Wd);												// Create Web activity assignment
			System.out.println("Web activity assignment created successfully!..");
			
			Eztassignment Ezt = new Eztassignment();	
			Ezt.Eztassignment(Wd);											// Create EZT assignment
			System.out.println("EZT assignment created successfully!..");					
			
			Speechassignment Sp = new Speechassignment();	
			Sp.Speechassignment(Wd);										// Create Speech assignment
			System.out.println("Speech assignment created successfully!..");		
			
			Createnewcourse Ca = new Createnewcourse();	
			Ca.Createnewcourse(Wd);											// Create New Course
			System.out.println("New Course created successfully!..");					
			
					
			Blogassign Ba = new Blogassign();
			Ba.Blogassign(Wd);												// Create Writing assignment
			System.out.println("Blog assignment created successfully!.."); 
			
			Fileattch Fa = new Fileattch();
			Fa.Fileattch(Wd); 												// Create File attachment assignment
			System.out.println("File attachment assignment created successfully!..");			
			
			Writeassign Wt = new Writeassign();
			Wt.Writeassign(Wd);												// Create Writing assignment
			System.out.println("Writing assignment created successfully!..");
			
			Discussionboard Da = new Discussionboard();			
			Da.Discussionboard(Wd);											// Create Writing assignment
			System.out.println("Discussion board assignment created successfully!..");      			
			*/
			Logout lo = new Logout();
			lo.Logout(Wd);
			System.out.println("Logout Succussful !..");			
			
			Wd.close();    													//close Firefox            
			System.exit(0);	          										// exit the program explicitly

	}

}  
