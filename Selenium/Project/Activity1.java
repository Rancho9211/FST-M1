package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {
	// Create a new instance of the Firefox driver
	WebDriver driver = new FirefoxDriver();
		
	//Open the browser
	driver.get("http://alchemy.hguy.co/orangehrm");
	String pageTitle = driver.getTitle();
    System.out.println(pageTitle);
    driver.getTitle().equals("OrangeHRM");
    System.out.println("Title match:" + driver.getTitle().equals("OrangeHRM"));
    
	//Close the browser
	driver.close();
    }
 
}