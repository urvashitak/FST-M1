package mainselproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity6 {
	
	@Test
	void Search() {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("banking");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.findElement(By.xpath("//h3[contains(text(),'Banking')]")).click();

driver.findElement(By.xpath("//input[@type='button']")).click();
System.out.println("EMail " + (driver.findElement(By.linkText("san@gmail.com")).getText()));
driver.quit();
	}
}
