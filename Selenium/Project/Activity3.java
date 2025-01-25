package mainselproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class Activity3 {
	@SuppressWarnings("deprecation")
	@Test
	void getImageUrl() {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/jobs");
	WebElement url=driver.findElement(By.tagName("img"));
	 System.out.println(url.getAttribute("src"));
		driver.quit();
	      }
}
