package QSpiderExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSignInCheckBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https:google.com");
		
		driver.findElement(By.xpath("//a[@id='gb_70']")).click();  // click on sign in
		
		driver.findElement(By.id("Email")).sendKeys("mahadev.is57");
		
		driver.findElement(By.id("next")).click();
		Thread.sleep(500);
		
		WebElement WB = driver.findElement(By.id("PersistentCookie"));
		Thread.sleep(500);
		
		boolean S1 = WB.isDisplayed();
		boolean S2 = WB.isSelected();
		
		if(S1 == true && S2 == true)
		{
			System.out.println("Check box is Enabled = PASS");
		}else{
			System.out.println("Check box is Disabled = FAIL");
		}
		
		driver.quit();

	}

}
