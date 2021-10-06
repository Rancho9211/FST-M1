package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String Title=driver.getTitle();
		System.out.println("Page title is: " + Title);
		driver.findElement(By.xpath("//html/body/div/div/div/a")).click();
		String Title1=driver.getTitle();
		System.out.println("Page title is: " + Title1);
		driver.close();
	}

}
