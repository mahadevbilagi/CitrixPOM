package Old_Connect.logout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Logout {
	
	
	public void Logout(WebDriver wd) throws InterruptedException {
		
		
		Thread.sleep(1000);
		wd.findElement(By.xpath(".//*[@id='headerStripe']/div/ul/li[4]/a")).click();
		Thread.sleep(1000);
		
	}
	
}
