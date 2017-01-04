package Old_Connect.discussionboardassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Discussionboard {
	

	public void Discussionboard(WebDriver wd) throws InterruptedException {	
		
		wd.findElement(By.id("tabassign_2")).click();
		wd.findElement(By.xpath(".//*[@id='addassignment_icon_ctr']/div[10]/h2/a")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.id("assignmentTitle")).click();
		wd.findElement(By.id("assignmentTitle")).clear();
		wd.findElement(By.id("assignmentTitle")).sendKeys("Discussionboard-01");
		Thread.sleep(1000);
		
	/*	wd.findElement(By.className("mceContentBody ")).click();
		wd.findElement(By.className("mceContentBody ")).clear();
		wd.findElement(By.className("mceContentBody ")).sendKeys("Discussion board assignment");
		Thread.sleep(1000);       */
		
		Thread.sleep(2000);
		wd.switchTo().frame(wd.findElement(By.id("note_ifr")));  		// get inside the HTML Page
		wd.findElement(By.id("tinymce")).sendKeys("Discussion board assignment description");
		Thread.sleep(500);

		wd.switchTo().parentFrame();                         // get out from the inner HTML Page	
		
		
		wd.findElement(By.id("pointValue")).click();
		wd.findElement(By.id("pointValue")).clear();
		wd.findElement(By.id("pointValue")).sendKeys("100");
		Thread.sleep(1000);
		
		wd.findElement(By.id("availablity_now")).click();       //  Now
	//	wd.findElement(By.id("availablity_later")).click();		//  Later
				
		wd.findElement(By.id("dueDate")).click();
		wd.findElement(By.id("dueDate")).clear();
		wd.findElement(By.id("dueDate")).sendKeys("12/31/2014");
		Thread.sleep(2000);
		
		
		wd.findElement(By.xpath(".//*[@id='reviewassign']/a/span")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.xpath(".//*[@id='assignBtn']/a")).click();
		Thread.sleep(1000);
	
	}
}
