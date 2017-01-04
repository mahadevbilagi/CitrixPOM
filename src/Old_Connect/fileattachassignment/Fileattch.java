package Old_Connect.fileattachassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Fileattch {
		
	
	public void Fileattch(WebDriver wd) throws InterruptedException {

		wd.findElement(By.id("tabassign_2")).click();
		wd.findElement(By.xpath(".//*[@id='addassignment_icon_ctr']/div[11]/h2/a")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.id("assignmentTitle")).click();
		wd.findElement(By.id("assignmentTitle")).sendKeys("FileAttach-01");
		
		wd.findElement(By.id("note")).click();
		wd.findElement(By.id("note")).sendKeys("file attachment assignment");
		
		wd.findElement(By.id("maxScore")).click();
		wd.findElement(By.id("maxScore")).clear();
		wd.findElement(By.id("maxScore")).sendKeys("50");
		
		wd.findElement(By.id("setpolicies_btn")).click();
		Thread.sleep(2000);
		
		wd.findElement(By.xpath(".//*[@id='Qbtmbuttons']/div[2]/span[2]/a")).click();
		Thread.sleep(1000);
		
}
	 
}
