package Old_Connect.writingassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Writeassign {

	@Test
	public void Writeassign(WebDriver wd) throws InterruptedException {
		
		wd.findElement(By.id("tabassign_2")).click();
		wd.findElement(By.xpath(".//*[@id='addassignment_icon_ctr']/div[8]/h2/a")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.id("assignmentTitle")).click();
		wd.findElement(By.id("assignmentTitle")).clear();
		wd.findElement(By.id("assignmentTitle")).sendKeys("writing assignment-01");
		
		Thread.sleep(2000);
		wd.switchTo().frame(wd.findElement(By.id("note_ifr")));  		// get inside the HTML Page
		wd.findElement(By.id("tinymce")).sendKeys("Writing assignment description");
		Thread.sleep(500);

		wd.switchTo().parentFrame();                         // get out from the inner HTML Page	
		
		wd.findElement(By.id("pointValue")).click();
		wd.findElement(By.id("pointValue")).clear();
		wd.findElement(By.id("pointValue")).sendKeys("50");
		
		wd.findElement(By.id("availablity_now")).click();
		
		wd.findElement(By.id("both")).click();
		
		wd.findElement(By.xpath(".//*[@id='connect_english']/div[3]/div[2]/div[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[3]/input[1]")).click();
		
		((JavascriptExecutor) wd).executeScript ("document.getElementById ('dueDate').removeAttribute('readonly',0);");
		WebElement Date= wd.findElement(By.id("dueDate"));
		Date.clear();
		Date.sendKeys("12/31/2014");     //   Enter this date details with valid date format  MM/DD/YYYY
		Thread.sleep(2000);
		
/*		wd.findElement(By.id("dueDate")).click();
		wd.findElement(By.id("dueDate")).clear();
		((Select) wd).selectByVisibleText("10 Jan 2013");
		
			wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		  //Click on textbox so that datepicker will come  
			wd.findElement(By.id("dueDate")).click();  
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
			
			wd.findElement(By.id("dueDate")).sendKeys("07/29/2014");
			
			wd.findElement(By.xpath(".//*[@id='dueDate']")).sendKeys("07/29/2014");
			
		  //Click on next so that we will be in next month  
			wd.findElement(By.xpath(".//*[@id='dueDate']")).click();  
		    
	//      DatePicker is a table.So navigate to each cell, If a particular cell matches value 13 then select it    
		  WebElement dateWidget = wd.findElement(By.id("dp-popup"));  
		  List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));  
		  List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
		  
		  wd.findElement(By.xpath("ui-state-default ui-state-highlight ui-state-active")).click();
		  wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		  for (WebElement cell: columns)
		  {  
			  //Select 29th Date   
			  if (cell.getText().equals("29"))
			  {  
				  cell.findElement(By.linkText("29")).click();  
				  break;  
			  }    		   
		  }               
					*/
				
				
		wd.findElement(By.xpath(".//*[@id='reviewassign']/a")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.xpath(".//*[@id='assignBtn']/a")).click();
		Thread.sleep(1000);
		
	}	
	
}
