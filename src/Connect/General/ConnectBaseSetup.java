package Connect.General;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Connect.PageFactory.BlogAssignment;
import Connect.PageFactory.LoginPage;
import Connect.PageFactory.LogoutPage;
import Connect.PageFactory.Selectsection;
import Connect.PageFactory.WritingAssignment;

public class ConnectBaseSetup {	
	
			protected static WebDriver driver;	
			
			protected String Dev2URL = "https://connectdev2.mheducation.com/connect/shortUrl.do";
			protected String QaStgURL = "https://connectqastg.mheducation.com/connect/shortUrl.do";
			protected String QaLiveURL = "https://connectqalv.mheducation.com/connect/shortUrl.do";
			
			protected static String Dev2SectionURL = "http://connectdev2.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=241484236";			
			protected static String QaStgSectionURL = "http://connectqastg.mheducation.com/connect/hmInstructorSectionHomePortal.do?sectionId=515805475";
			
			
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
				System.setProperty("webdriver.chrome.driver","D:\\All JAR files for selenium\\chromedriver.exe"); 
				
		//		driver = new FirefoxDriver();
				driver = new ChromeDriver();
				
				driver.manage().deleteAllCookies();
		//		driver.get(Dev2URL);
				driver.get(QaStgURL);
		//		driver.get(QaLiveURL);
				
				Log.info("Welcome Chrome!");		
				waitforApge();
				
				loginPage = PageFactory.initElements(driver, LoginPage.class);
				logoutPage = PageFactory.initElements(driver, LogoutPage.class);	
				selectsection = PageFactory.initElements(driver, Selectsection.class);
				BlogCreate = PageFactory.initElements(driver, BlogAssignment.class);
				WriteCreate = PageFactory.initElements(driver, WritingAssignment.class);
				
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