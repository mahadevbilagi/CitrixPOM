package Citrix.TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Citrix.General.TestBaseSetup;
import Citrix.PageFactory.BasePage;
import Citrix.PageFactory.CreateAccountPage;
import Citrix.PageFactory.SignInPage;

public class CreateAnAccounTest extends TestBaseSetup {
	private WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;
	private CreateAccountPage createAccountPage;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
		}
		
		@Test
		public void verifyCreateAnAccounPage() {
			System.out.println("Create An Account page test...");
			basePage = new BasePage(driver);
			signInPage = basePage.clickSignInBtn();
			createAccountPage = signInPage.clickonCreateAnAccount();
			Assert.assertTrue(createAccountPage.verifyPageTitle(), "Page title not matching");
			Assert.assertTrue(createAccountPage.verifyCreateAccountPageText(), "Page text not matching");
		}
		
		public void verifySignInFunction() {
			
		}

}