package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity5 {

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
	    driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
	    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	    driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys("Rancho");
	    driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys("Test");
	    driver.findElement(By.id("personal_optGender_1")).click();
	    
	    Select objSelect =new Select(driver.findElement(By.id("personal_cmbNation")));
	    objSelect.selectByVisibleText("Indian");
	    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	    

	    driver.close();
	    }
	 
	}