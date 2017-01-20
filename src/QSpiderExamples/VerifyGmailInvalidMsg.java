package QSpiderExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyGmailInvalidMsg {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver;
			
			String UserName = "mahadev.is57";
			String Expmsg = "   Wrong password. Try again.   ";
			
			System.setProperty("webdriver.gecko.driver","D:\\All JAR files for selenium\\geckodriver.exe");     // Gecko driver path setup			
			System.setProperty("webdriver.chrome.driver","D:\\All JAR files for selenium\\chromedriver.exe");
					
		//	driver = new ChromeDriver();
			driver = new FirefoxDriver();
	
			driver.get("https://google.com");
			driver.findElement(By.xpath("//a[@id='gb_70']")).click();  // Sign in
			
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(UserName);
			driver.findElement(By.xpath("//input[@id='next']")).click(); // click next
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("123456");  // wring password
			driver.findElement(By.xpath("//input[@id='signIn']")).click();
			Thread.sleep(500);
			WebElement Wb = driver.findElement(By.xpath("//span[@id='errormsg_0_Passwd']"));
			
			String ActMsg = Wb.getText();		
			
			if(Expmsg.equals(ActMsg))
			{
				System.out.println("Invalid message is verified = PASS");
			}else{
				System.out.println("Invalid message is verified = FAIL");
			}
		
			driver.close();
			
	}
}