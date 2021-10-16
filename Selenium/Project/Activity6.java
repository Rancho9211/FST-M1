package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity6 {

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
	    Boolean Visible = driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).isDisplayed();
	    Boolean Clickable = driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).isEnabled();
	    System.out.println("“Directory” menu item is visible: " +Visible);
	    System.out.println("“Directory” menu item is Clickable: " +Clickable);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();
	    Thread.sleep(2000);
	    String t =  driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
	    System.out.println(t);  
	    // getPageSource() to get page source
	      if ( driver.getPageSource().contains("Search Directory")){
	         System.out.println("Text: " + t + " is present. ");
	      } else {
	         System.out.println("Text: " + t + " is not present. ");
	      }
	  
	    driver.close();
	    }
	 
	}