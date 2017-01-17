package Connect.PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Connect.General.ConnectBaseSetup;

public class WebActivityAssignment extends ConnectBaseSetup {
		
	@FindBy(xpath = "//a[contains(text(),'Add assignment')]")
	WebElement AddAssignment;
	
	@FindBy(xpath = "//a[contains(text(),'web activity')]")
	WebElement WebAssignment;
	
	@FindBy(xpath = "//input[@id='assignmentTitle']")
	WebElement AssignmentTitle;
	
	@FindBy(xpath = "//textarea[@id='note']")
	WebElement WebDescritpion;
	
	@FindBy(xpath = "//input[@id='webLinkName']")
	WebElement WebLinkName1;
	
	@FindBy(xpath = "//input[@id='webLinkURL']")
	WebElement WebLinkURL1;
	
	@FindBy(xpath = "//a[@class='addweblinks']")
	WebElement AddNewWeblink;
	
	@FindBy(xpath = "//div[@class='weblinkcontainer padtop13']/div/div/input[@id='webLinkName']")
	WebElement WebLinkName2;
	
	@FindBy(xpath = "//div[@class='weblinkcontainer padtop13']/div/div/input[@id='webLinkURL']")
	WebElement WebLinkURL2;
	
	@FindBy(xpath = "//span[@class='buttons btgy bkbtn']")
	WebElement Cancel;
	
	@FindBy(xpath = "//span[@class='buttons btgy']")
	WebElement SaveandExit;		
	
	@FindBy(xpath = "//span[@class='buttons btbl']/span")
	WebElement NextAssign;
	
	@FindBy(xpath = "//input[@id='scheduleDateStart']")
	WebElement AvailableStartDate;
	
	@FindBy(xpath = "//input[@id='scheduleDateEnd']")
	WebElement AvailableDueDate;
	
	@FindBy(xpath = "//li[@class='grey_cntr bkbtn webassignmentprevious buttons btgy']/span")
	WebElement PreviousSetupAssignment;
	
	@FindBy(xpath = "//li[@class='grey_cntr bkbtn buttons btgy']")
	WebElement SaveandExitRVPage;
	
	@FindBy(xpath = "//li[@class='assign-blue-btn_cntr buttons btbl']")
	WebElement Assign;
		
	@SuppressWarnings("static-access")
	public WebActivityAssignment(WebDriver driver){
		this.driver = driver;
	}
		
	public void CheckAddAssignment()
	{		
		AddAssignment.isEnabled();	
		AddAssignment.click();		
		System.out.println("Add assignment Found in the Current Section!");		
	}
	
	public void CheckWebActivityLink()
	{				
		WebAssignment.isEnabled();	
		WebAssignment.click();		
		System.out.println("WebActivity assignment Found in the Current Section!");
	}	
	
	public void CreateWebActivityAssignment() throws InterruptedException{	
		
		AddAssignment.isEnabled();	
		AddAssignment.click();
		Log.info("Click on Add assignment");
		
		WebAssignment.isEnabled();	
		WebAssignment.click();						
		Log.info("Click on Web Activity assignment");

		AssignmentTitle.sendKeys(Keys.ENTER);
		AssignmentTitle.sendKeys("Web Activity assignment - 01");	
		Log.info("Entering the Web Activity assignment title name");
		
		waitforApge();
		WebDescritpion.clear();
		WebDescritpion.sendKeys(Keys.ENTER);		
		WebDescritpion.sendKeys("Web Activity assignment description ...");
		waitforApge();
		Log.info("Entering the Web Activity assignment description");
		
		WebLinkName1.sendKeys("Google");
		Log.info("Entering the WebLink Name");
		WebLinkURL1.clear();
		WebLinkURL1.sendKeys("https://www.google.com");
		Log.info("Entering the WebURL Link");
		
		AddNewWeblink.click();
		Log.info("Click on Add new WebLink");
		waitforApge();
		
		WebLinkName2.sendKeys("Yahoo");
		Log.info("Entering the WebLink Name");
		WebLinkURL2.clear();
		WebLinkURL2.sendKeys("https://www.Yahoo.com");
		Log.info("Entering the WebURL Link");
		waitforApge();
		
		NextAssign.click();
		Log.info("Click Next assign button");		
		
		AvailableStartDate.click();
		AvailableStartDate.sendKeys("01/18/2017");
		Log.info("Entering the assignment Start date");
		
		AvailableDueDate.click();
		AvailableDueDate.sendKeys("12/18/2017");
		Log.info("Entering the assignment Due date");
		waitforApge();
		
		Assign.click();
		Log.info("Click on Assign button");			
	}	

}
