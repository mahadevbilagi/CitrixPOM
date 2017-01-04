package Old_Connect.eztassignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Eztassignment {

	public void Eztassignment(WebDriver wd) throws InterruptedException {
		
		wd.findElement(By.id("tabassign_2")).click();												// Click on add assignment		
		wd.findElement(By.xpath(".//*[@id='addassignment_icon_ctr']/div[1]/h2/a")).click();			// Click on EZT assignment
		
		wd.findElement(By.xpath(".//*[@id='sourcessection']/li[67]/span[2]/a/span")).click();		// Select source of questions
		
		wd.findElement(By.xpath(".//*[@id='questionListTable']/thead/tr/th[5]/input")).click();		//	add question - select all check box	
		
		wd.findElement(By.id("topaddQuestion")).click();											// click on add(X) checked questions
		wd.findElement(By.className("addQuestion")).click();										// click on add as individual questions
		Thread.sleep(2000);     
		
	//	wd.findElement(By.className("qp_poolmodal")).click();										// click on add to a pool		
		
		wd.findElement(By.xpath("//a[text()=' continue ']")).click();								// click on continue
		Thread.sleep(1000);       
		
		wd.findElement(By.id("renameTitle")).click();												// Enter title of the assignment
		wd.findElement(By.id("assignmentTitle")).click();												
		wd.findElement(By.id("assignmentTitle")).clear();
		wd.findElement(By.id("assignmentTitle")).sendKeys("EZT-01");
		wd.findElement(By.id("renameSave")).click();												// click on save button
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);     
		
		((JavascriptExecutor) wd).executeScript ("document.getElementById('scheduleDateEnd').removeAttribute('readonly',0);");
		WebElement Date1= wd.findElement(By.id("scheduleDateEnd"));
		Date1.clear();
		Date1.sendKeys("12/31/2014");       																			// Enter Due date of assignment
		Thread.sleep(1000);  
				
		wd.findElement(By.id("reviewAndAssignBtn")).click();															// Click on Review & Assign
		wd.findElement(By.xpath(".//*[@id='shareCopy']/div[14]/div/div[2]/span/a")).click();							// Click on Assign				
		
	}

}
