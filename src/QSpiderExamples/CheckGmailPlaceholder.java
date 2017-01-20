package QSpiderExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckGmailPlaceholder {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver;
			
			String PlacehoderexpectedEmail = "Enter your email";
						
			System.setProperty("webdriver.gecko.driver","D:\\All JAR files for selenium\\geckodriver.exe");     // Gecko driver path setup			
			System.setProperty("webdriver.chrome.driver","D:\\All JAR files for selenium\\chromedriver.exe");
					
		//	driver = new ChromeDriver();
			driver = new FirefoxDriver();
	
			driver.get("https://google.com");
			driver.findElement(By.xpath("//a[@id='gb_70']")).click();  // Sign in
		
			Thread.sleep(500);
			String PlacehoderActualEmail = driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("PlaceHolder");
			
			if(PlacehoderexpectedEmail.equals(PlacehoderActualEmail))
			{
				System.out.println("Placeholder mesage is verified = PASS :"+ PlacehoderActualEmail);	
				
			}else{
				System.out.println("Placeholder mesage is verified = FAIL");
			}
						
		}			
}