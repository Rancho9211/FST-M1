package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
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
	    driver.findElement(By.id("menu_pim_viewMyDetails")).click(); 
	    driver.findElement(By.xpath("//div[@id='sidebar']/ul[@id='sidenav']//li[contains(.,'Qualifications')]")).click(); 
	    driver.findElement(By.xpath("//input[@id='addWorkExperience']")).click();
	    driver.findElement(By.xpath("//input[@id='experience_employer']")).sendKeys("IBM India");
	    driver.findElement(By.xpath("//input[@id='experience_jobtitle']")).sendKeys("SDET");
	    driver.findElement(By.xpath("//input[@id='btnWorkExpSave']")).click(); 
	    driver.close();
	   
	  
	    
	}
}