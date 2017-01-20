package QSpiderExamples;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementsTest {
	
public static void main(String[] args) throws Exception {
		
		// Launch browser
		WebDriver driver = new FirefoxDriver();
		// Maximize window
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("http://www.techbeamers.com");
		// Sleep for 5 seconds
		Thread.sleep(5000);
		
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		// print the total number of elements
		System.out.println("The Links are " + Links.size());
		
		// Now using Iterator we will iterate all elements
		Iterator<WebElement> iter = Links.iterator();
		
		// this will check whether list has some element or not
		while (iter.hasNext()) {
			// Iterate one by one
			WebElement item = iter.next();
			// get the text
			String label = item.getText();
			// print the text
			System.out.println("Link Name " + label);
		}
	}
}
