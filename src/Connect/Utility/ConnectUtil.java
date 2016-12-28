/*package Connect.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Connect.PageFactory.LoginPage;
import Connect.PageFactory.LogoutPage;

 
public class ConnectUtil {
 
	protected WebDriver driver;
	protected String baseUrl;
	protected LoginPage loginPage;
	protected LogoutPage logoutPage;

	 
	// Method-1.
	@BeforeSuite
	public void setUp() {
	baseUrl = "https://connectqastg.mheducation.com/connect/shortUrl.do";
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	}
	 
	// Method-2.
	@AfterSuite
	public void tearDown() throws Exception {
	driver.quit();
 
	}
}*/