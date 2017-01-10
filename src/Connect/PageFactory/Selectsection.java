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
		
		//driver.navigate().to("http://connectqastg.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=515805475");				  // Staging
		
		driver.navigate().to(Dev2SectionURL);                  // Dev2
		
		waitforApge();					
	}
}