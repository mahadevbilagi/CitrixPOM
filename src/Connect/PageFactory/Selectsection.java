package Connect.PageFactory;

import org.openqa.selenium.WebDriver;
import Connect.General.ConnectBaseSetup;

public class Selectsection extends ConnectBaseSetup {	
	
	@SuppressWarnings("static-access")
	public Selectsection(WebDriver driver){
		this.driver = driver;
	}
	
	public static void navigatetosection()
	{		
		waitforApge();	
		//driver.navigate().to("http://connectqastg.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=515805475");
		driver.navigate().to("http://connectdev2.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=241484236");
		waitforApge();					
	}
}