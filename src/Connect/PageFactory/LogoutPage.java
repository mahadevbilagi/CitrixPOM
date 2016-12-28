package Connect.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Connect.General.FFConnectBaseSetup;

public class LogoutPage extends FFConnectBaseSetup {
	
	 
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
 		 
	@FindBy(xpath = ".//*[@id='headerStripe']/div/ul/li[4]/a")
	WebElement LogoutButton;
	
	public LogoutPage ClickonLogoutButton() {
		LogoutButton.click();		
		Log.info("LogoutButton found");
		waitforApge();
		return PageFactory.initElements(driver, LogoutPage.class);
	}	
		
}