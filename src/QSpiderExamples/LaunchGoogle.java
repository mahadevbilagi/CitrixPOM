package QSpiderExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGoogle {

	public static void main(String[] args) {

		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","D:\\All JAR files for selenium\\geckodriver.exe");     // Gecko driver path setup			
		System.setProperty("webdriver.chrome.driver","D:\\All JAR files for selenium\\chromedriver.exe");
				
	//	driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
		driver.get("https://Google.com");
		
		String ActualTitle = driver.getTitle();
		
		String ExpectedTitle = "Google";
		
		WebElement Wb = driver.findElement(By.id("hplogo"));
		
		Boolean ImageStatus = Wb.isDisplayed();
			
		if(ImageStatus == true)
		{ 
			System.out.println("Google logo is displayed = PASS");
			
		}else{
			System.out.println("Google logo is NOT displayed = FAIL");
		}		
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Home page title is Correct - Test case PASS");
		}else{
			System.out.println("Home page title is Incorrect - Test case FAIL");
		}			
		
		driver.findElement(By.xpath("//a[@id='gb_70']")).click();  // click on sign in			
			
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.quit();		

	}

}
