package Connect.PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
	
	@FindBy(xpath = "//input[@id='pointValue']")
	WebElement Score;
	
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
	
	@FindBy(xpath = "//div[@class='heading_block clearfix vertical_line']/span/a[@class='ico off_review']")
	WebElement StudentSelfReviewOff;
	
	@FindBy(xpath = "//div[@class='heading_block clearfix vertical_line']/span/a[@class='ico on_review']")
	WebElement StudentSelfReviewOn;
	
	// Rubric logic need to write	
	
	@FindBy(xpath = "//div[@id='peer_review_header']/div/div/div/span/a[@class='ico off_review']")
	WebElement StudentPeerReviewOff;
	
	@FindBy(xpath = "//div[@id='peer_review_header']/div/div/div/span/a[@class='ico on_review']")
	WebElement StudentPeerReviewOn;
	
	@FindBy(xpath = "//select[@id='peerReviewDuetime']")
	WebElement PeerReviewDuetime;
	
	@FindBy(xpath = "//select[@id='noOfStudentsPerGroup']")
	WebElement NoOfStudentsPerGroup;
	
	@FindBy(xpath = "//input[@id='completely_open']")
	WebElement EveryOne;
	
	@FindBy(xpath = "//input[@id='partially_open']")
	WebElement SpeakerandInstructor;
	
	@FindBy(xpath = "//input[@id='private_open']")
	WebElement InstructorOnly;
	
	@FindBy(xpath = "//div[@id='instructor_review_header']/div/div/div/span/a[@class='ico off_review']")
	WebElement InstructorReviewOff;
	
	@FindBy(xpath = "//div[@id='instructor_review_header']/div/div/div/span/a[@class='ico on_review']")
	WebElement InstructorReviewOn;
		
	// Rubric logic need to write	
	
	@FindBy(xpath = "//textarea[@id='note']")
	WebElement MessagetoStudents;
	
	@FindBy(xpath = "//a[@id='exitAssignmentSetUp']/span")
	WebElement Exit;
	
	@FindBy(xpath = "//a[@id='saveExit']/span")	
	WebElement SaveandExit;
	
	@FindBy(xpath = "//a[@id='reviewAssign']/span")
	WebElement ReviewandAssign;
	
	@FindBy(xpath = "//a[@class='saveAssignbtn btntwo right btn_margin_space ']/span")
	WebElement Assign;
		
	@SuppressWarnings("static-access")
	public SpeechAssignment(WebDriver driver){
		this.driver = driver;		
	}
	
	public void CreateSpeeachAssignment(String type,String AvailableType,String SpeechType,boolean StudentSelf,boolean StudentPeer,boolean InstructorReview) throws InterruptedException{
		
		AddAssignment.isEnabled();
		AddAssignment.click();
		Log.info("Click on Add assignment");
		
		SpeechAssignment.isEnabled();
		SpeechAssignment.click();
		Log.info("Click on Speech assignment");
		
		AssignmentTitle.sendKeys(Keys.ENTER);
		AssignmentTitle.sendKeys("Speech Assignment - 01");
		Log.info("Entering the assignment title name");
		
		Score.clear();
		Score.sendKeys("50");
		Log.info("Entering the valus of score");
		
				
		if(AvailableType=="NOW"){

		}else{        

		}

		if(SpeechType=="InClass"){

		}
		else {

		}


		If(StudentSelf = 0 )
		{
			
		}

		If( StudentPeerReview )
		{

		}
						
		If( InstructorReview))
		{

		}
		
		
		
		


		
		
		AssignmentAvailabilityNOW.click();
		Log.info("Click on assignment available now");
		
		
		
		
		
	}	
	
}

