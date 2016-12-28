package Connect.General;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Connect.PageFactory.LoginPage;
import Connect.PageFactory.LogoutPage;
public class FFConnectBaseSetup {
	
	protected WebDriver driver;	
	protected String baseUrl = "https://connectqastg.mheducation.com/connect/shortUrl.do";
	protected LoginPage loginPage;
	protected LogoutPage logoutPage;
	
	public static Logger Log = Logger.getLogger(Log.class.getName());

	@BeforeMethod
	public void LaunchBrowserwithURL()
	{
		DOMConfigurator.configure("log4j.xml"); 
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		Log.info("Welcome Firefox!");
		
		waitforApge();
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
		Log.info("Closing the Firefox!");
	}
	
	public void waitforApge()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	// Method-1. abc
//	@BeforeSuite
//	public void setUp() {
//	baseUrl = "https://connectqastg.mheducation.com/connect/shortUrl.do";
//	driver = new FirefoxDriver();
//	driver.get(baseUrl);
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	 
//	}
	 
	// Method-2.
//	@AfterSuite
//	public void tearDown() throws Exception {
//	driver.quit();
//	}
	
	
}