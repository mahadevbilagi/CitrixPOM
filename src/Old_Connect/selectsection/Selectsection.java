package Old_Connect.selectsection;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Selectsection {
		
	
	public  static void Selectsection(WebDriver wd) throws InterruptedException {		
			
			Thread.sleep(1000);
			wd.navigate().to("https://connectqastg.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=515644917");
			Thread.sleep(1000);	
			
	}
	
}
