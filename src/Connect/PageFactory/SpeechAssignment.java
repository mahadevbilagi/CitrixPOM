package Connect.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Connect.General.ConnectBaseSetup;

public class SpeechAssignment extends ConnectBaseSetup {	
	
	@FindBy(xpath = "//a[contains(text(),'Add assignment')]")
	WebElement AddAssignment;
	
	@FindBy(xpath = "//a[contains(text(),'speech')]")
	WebElement SpeechAssignment;
	
	@FindBy(xpath = "//input[@id='assignmentTitle']")
	WebElement AssignmentTitle;
	
	@FindBy(xpath = "//input[@value='NOW']")
	WebElement AssignmentAvailabilityNOW;
	
	@FindBy(xpath = "//input[@value='LATER']")
	WebElement AssignmentAvailabilityLATER;
	
	@FindBy(xpath = "//input[@id='startDate']")
	WebElement StartDate;
	
	@FindBy(xpath = "//select[@id='starttime']")
	WebElement StartTime;	
	
	@FindBy(xpath = "//input[@id='assess_student_speeches_inclass']")
	WebElement InClass;
	
	@FindBy(xpath = "//input[@id='inClassDueDate']")
	WebElement InClassDueDate;
	
	@FindBy(xpath = "//select[@id='inClassDuetime']")
	WebElement InClassDueTime;
	
	@FindBy(xpath = "//input[@id='assess_student_speeches_online']")
	WebElement Online;
		
	@FindBy(xpath = "//input[@id='onlineDueDate']")
	WebElement OnlineDueDate;
	
	@FindBy(xpath = "//select[@id='onlineDuetime']")
	WebElement OnlineDuetime;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

