package Old_Connect.blogassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Blogassign {

	
	public void Blogassign(WebDriver wd) throws InterruptedException {
		
		wd.findElement(By.id("tabassign_2")).click();
		wd.findElement(By.xpath(".//*[@id='addassignment_icon_ctr']/div[9]/h2/a")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.id("assignmentTitle")).click();
		wd.findElement(By.id("assignmentTitle")).clear();
		wd.findElement(By.id("assignmentTitle")).sendKeys("blog assignment-01");
		
		Thread.sleep(2000);
		wd.switchTo().frame(wd.findElement(By.id("note_ifr")));  		// get inside the HTML Page
		wd.findElement(By.id("tinymce")).sendKeys("Blog assignment description");
		Thread.sleep(500);

		wd.switchTo().parentFrame();                         // get out from the inner HTML Page	
		
		wd.findElement(By.id("pointValue")).click();
		wd.findElement(By.id("pointValue")).clear();
		wd.findElement(By.id("pointValue")).sendKeys("100");
		
		wd.findElement(By.id("availablity_now")).click();
	
	/* 	wd.findElement(By.id("dueDate")).click();
		wd.findElement(By.id("dueDate")).clear();
		wd.findElement(By.id("dueDate")).sendKeys("07/29/2014");
		Thread.sleep(500);          */
		
		((JavascriptExecutor) wd).executeScript ("document.getElementById ('dueDate').removeAttribute('readonly',0);");
		WebElement Date= wd.findElement(By.id("dueDate"));
		Date.clear();
		Date.sendKeys("12/31/2014");       //   Enter this date details with valid date format  MM/DD/YYYY
						
		Thread.sleep(2000);
		wd.findElement(By.xpath(".//*[@id='reviewassign']/a")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.xpath(".//*[@id='assignBtn']/a")).click();
		Thread.sleep(1500);
		
		
	}

}
