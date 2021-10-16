package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {
	// Create a new instance of the Firefox driver
	WebDriver driver = new FirefoxDriver();
		
	//Open the browser
	driver.get("http://alchemy.hguy.co/orangehrm");
	String pageTitle = driver.getTitle();
    System.out.println(pageTitle);
    WebElement img = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
    String src = img.getAttribute("src");
    System.out.println(src);
    driver.close();
    }
 
}