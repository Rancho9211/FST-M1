package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Activity3 {
	
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
			
		//Open the browser
		driver.get("http://alchemy.hguy.co/orangehrm");
		String pageTitle = driver.getTitle();
	    System.out.println(pageTitle);
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click(); 
	    String Actual = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
	    System.out.println(Actual);
	    Boolean result = driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
	    System.out.println(result);
	    driver.close();
	    }
	 
	}


