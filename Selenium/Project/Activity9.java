package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9 {
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
			
		//Open the browser
		driver.get("http://alchemy.hguy.co/orangehrm");
		String pageTitle = driver.getTitle();
	    System.out.println(pageTitle);
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.id("menu_pim_viewMyDetails")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='sidebar']/ul[@id='sidenav']//li[contains(.,'Emergency Contacts')]")).click(); 
	 // Get all the table row elements from the table 
	    List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='emgcontact_list']//tr")); 

	    // And iterate over them and get all the cells 
	    for (WebElement row : allRows) { 
	        List<WebElement> cells = row.findElements(By.tagName("td")); 

	        // Print the contents of each cell
	        for (WebElement cell : cells) {         

	        System.out.println(cell.getText());
	        //Or try below code 
	        //System.out.println(cell.getAttribute("innerHTML"));
	    }

	    
	}
	}
}
