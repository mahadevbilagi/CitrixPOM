package Old_Connect.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login {

	
	public void Login(WebDriver wd) throws InterruptedException {
		
		wd.manage().deleteAllCookies();  // Clear Firefox cache in Selenium IDE
		
		wd.get("http://connectqastg.mheducation.com/connect/shortUrl.do");         //  Environment: QA Staging Cloud 
//		wd.get("http://connectqalv.mheducation.com/connect/shortUrl.do");         //  Environment: QA Live Cloud
		
		wd.findElement(By.id("userName")).click();
		wd.findElement(By.id("userName")).sendKeys("nadmin@gmail.com");
		
		wd.findElement(By.id("password")).click();
		wd.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(50);
		
		wd.findElement(By.xpath(".//*[@id='signinForm']/fieldset/div[4]/div[1]/input")).click();
		Thread.sleep(1000);
	
	}

}
	
