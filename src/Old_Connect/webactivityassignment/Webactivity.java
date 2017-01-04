package Old_Connect.webactivityassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Webactivity {
	
	
	public static  void Webactivity(WebDriver wd) throws InterruptedException {
		// TODO Auto-generated method stub
		
		wd.findElement(By.id("tabassign_2")).click();
		wd.findElement(By.xpath(".//*[@id='addassignment_icon_ctr']/div[13]/h2/a")).click();
		
		wd.findElement(By.id("assignmentTitle")).click();
		wd.findElement(By.id("assignmentTitle")).sendKeys("WebActivity-01");

		wd.findElement(By.id("note")).click();
		wd.findElement(By.id("note")).sendKeys("Web-Assignment");
		
		wd.findElement(By.id("webLinkName")).click();
		wd.findElement(By.id("webLinkName")).sendKeys("Selenium-Wiki-info-Link");
		
		wd.findElement(By.id("webLinkURL")).click();
		wd.findElement(By.id("webLinkURL")).clear();
		wd.findElement(By.id("webLinkURL")).sendKeys("http://en.wikipedia.org/wiki/Selenium");
		
		wd.findElement(By.xpath(".//*[@id='setpolicies']/span")).click();
		Thread.sleep(1500);
		
		wd.findElement(By.xpath(".//*[@id='normalButtons']/ul[2]/li[2]")).click();
		Thread.sleep(1000);
		
	}

}
