package Connect.General;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Connect.PageFactory.BlogAssignment;
import Connect.PageFactory.WritingAssignment;
import Connect.PageFactory.LoginPage;
import Connect.PageFactory.LogoutPage;
import Connect.PageFactory.Selectsection;

public class ConnectBaseSetup {	
	
			protected static WebDriver driver;	
			protected String baseUrl = "https://connectqastg.mheducation.com/connect/shortUrl.do";
			public LoginPage loginPage;
			public LogoutPage logoutPage;
			public Selectsection selectsection;
			public BlogAssignment BlogCreate;
			public WritingAssignment WriteCreate;
			
			public static Logger Log = Logger.getLogger(Log.class.getName());
		
			@BeforeMethod
			public void LaunchBrowserwithURL()
			{
				DOMConfigurator.configure("log4j.xml"); 															// Log4j Configuration		
				System.setProperty("webdriver.gecko.driver","D:\\All JAR files for selenium\\geckodriver.exe");     // Gecko driver path setup
				
				driver = new FirefoxDriver();
				driver.manage().deleteAllCookies();
				driver.get(baseUrl);
				Log.info("Welcome Firefox!");		
				waitforApge();
				
				loginPage = PageFactory.initElements(driver, LoginPage.class);
				logoutPage = PageFactory.initElements(driver, LogoutPage.class);	
				selectsection = PageFactory.initElements(driver, Selectsection.class);
				BlogCreate = PageFactory.initElements(driver, BlogAssignment.class);
			}
			
			@AfterMethod
			public void CloseBrowser()
			{
					if(driver!=null) {
					driver.close();
					//driver.quit();
				}				
				Log.info("Closing the Firefox!");
			}
			
			public static void waitforApge()
			{
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}	
	
}