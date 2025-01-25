package mainselproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity2 {
	@Test
	void getHeading() {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/jobs");
	System.out.println("heading: " + driver.findElement((By.xpath("//h1[contains(text(), 'Welcome to Alchemy Jobs')]"))).getText());
	String matchhead = "Welcome to Alchemy Jobs";

			if((driver.findElement((By.xpath("//h1[contains(text(), 'Welcome to Alchemy Jobs')]"))).getText().equalsIgnoreCase(matchhead))){
		driver.quit();
	      }
}
}