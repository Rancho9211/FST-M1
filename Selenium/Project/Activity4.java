package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity4 {

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
	    //Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
	    driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rancho");
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Test");
	    driver.findElement(By.xpath("//input[@id='btnSave']")).click(); 
	    driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Rancho");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//ul/li[1]/strong")).click();
	    driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	    String result = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
	    System.out.println("Creation of Employee " + result + " has been done successfully");

	    
	  //a[text()='Rancho']/@href
	    driver.close();
	    }
	 
	}