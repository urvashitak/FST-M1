package mainselproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
	@BeforeMethod
	void launchurl() {
		 driver= new FirefoxDriver();
			driver.get("https://alchemy.hguy.co/jobs");	
	}
	@Test
	void goToJobs() {
	
	driver.findElement(By.linkText("Jobs")).click();
	System.out.println("Title: " + driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Jobs – Alchemy Jobs");
	driver.quit();
	      }
	
}

