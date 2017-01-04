package Old_Connect.speechassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Speechassignment {

	
	public void Speechassignment(WebDriver wd) throws InterruptedException {
		// TODO Auto-generated method stub
		
		wd.findElement(By.id("tabassign_2")).click();											// Click on add assignment
		
		wd.findElement(By.xpath(".//*[@id='addassignment_icon_ctr']/div[12]/h2/a")).click();	// Click on speech assignment
		wd.findElement(By.id("assignmentTitle")).click();
		wd.findElement(By.id("assignmentTitle")).sendKeys("Speech-01");							// Enter assignment name for speech assignment
		
		wd.findElement(By.id("pointValue")).click();
		wd.findElement(By.id("pointValue")).clear();
		wd.findElement(By.id("pointValue")).sendKeys("100");									// Enter assignment is worth of
		
		wd.findElement(By.xpath(".//*[@id='setup_assign']/div[1]/div[3]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[3]/input")).click();   // Select Radio Button = Now
		
/*		wd.findElement(By.xpath(".//*[@id='assignment_availablity']")).click();   				// Select Radio Button = Later
		
		((JavascriptExecutor) wd).executeScript ("document.getElementById('startDate').removeAttribute('readonly',0);");
		WebElement Date= wd.findElement(By.id("startDate"));
		Date.clear();
		Date.sendKeys("12/01/2014");       														//   Enter Start Date
		
		((JavascriptExecutor) wd).executeScript ("document.getElementById('startDate').removeAttribute('readonly',0);");
		WebElement Date1= wd.findElement(By.id("startDate"));
		Date1.clear();
		Date1.sendKeys("12/01/2014");       														//   Enter Start Date
		
		wd.findElement(By.xpath(".//*[@id='assess_student_speeches_inclass']")).click();			//   Select Radio Button = In Class
		
		((JavascriptExecutor) wd).executeScript ("document.getElementById('inClassDueDate').removeAttribute('readonly',0);");
		WebElement Date11= wd.findElement(By.id("inClassDueDate"));
		Date11.clear();
		Date11.sendKeys("12/01/2014");       																		//   Enter inClassDueDate
				*/
		
		wd.findElement(By.xpath(".//*[@id='assess_student_speeches_online']")).click();								//   Select Radio Button = online
		
		((JavascriptExecutor) wd).executeScript ("document.getElementById('onlineDueDate').removeAttribute('readonly',0);");
		WebElement Date111= wd.findElement(By.id("onlineDueDate"));
		Date111.clear();
		Date111.sendKeys("12/02/2014");       																		//   Enter onlineDueDate
		
	//	wd.findElement(By.xpath(".//*[@id='self_review_header']/div/div/div[1]/span/a[1]")).click();				// Student Self Review = Off
		wd.findElement(By.xpath(".//*[@id='self_review_header']/div/div/div[1]/span/a[2]")).click();				// Student Self Review = On
		
	//	wd.findElement(By.xpath(".//*[@id='peer_review_header']/div/div/div[1]/span/a[1]")).click();				// Student Peer Review = Off
		wd.findElement(By.xpath(".//*[@id='peer_review_header']/div/div/div[1]/span/a[2]")).click();				// Student Peer Review = On

		((JavascriptExecutor) wd).executeScript ("document.getElementById('peerReviewDueDate').removeAttribute('readonly',0);");
		WebElement Date1= wd.findElement(By.id("peerReviewDueDate"));
		Date1.clear();
		Date1.sendKeys("12/08/2014");       																			// Enter peerReviewDueDate
		
		wd.findElement(By.id("noOfStudentsPerGroup")).click();															// click on noOfStudentsPerGroup
		Thread.sleep(1000);	
		
		wd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);     		
		Select dropdown = new Select(wd.findElement(By.id("noOfStudentsPerGroup")));									// select number of students in group
		dropdown.selectByValue("3");					
		wd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);     
		
/*		Select sel = new Select(wd.findElement(By.id("noOfStudentsPerGroup")));											// select number of students in group
		sel.selectByValue("3");			
		Thread.sleep(1000);	*/
		
		wd.findElement(By.id("completely_open")).click();																// Select Everyone
//		wd.findElement(By.id("partially_open")).click();																// Select speaker & instructor
//		wd.findElement(By.id("private_open")).click();																	// Select instructor only
		
	//	wd.findElement(By.xpath(".//*[@id='instructor_review_header']/div/div/div[1]/span/a[1]")).click();				//  instructor review/grading = Off
		wd.findElement(By.xpath(".//*[@id='instructor_review_header']/div/div/div[1]/span/a[2]")).click();				//  instructor review/grading = On
		
		wd.findElement(By.id("note")).clear();																			//	Enter message to students
		wd.findElement(By.id("note")).sendKeys("All the Best .. ");														//	Enter message to students
		
	//  wd.findElement(By.xpath(".//*[@id='exitAssignmentSetUp']/span/b").click();										// Click on Exit button
	//	wd.findElement(By.xpath(".//*[@id='saveExit']/span/b")).click();												// Click on Save & Exit button
		
		wd.findElement(By.id("reviewAssign")).click();																	// Click on Review & Assign button
		wd.findElement(By.xpath(".//*[@id='setup_assign']/div[4]/div/span/a/span/b")).click();							// Assign		
		
	}

}


