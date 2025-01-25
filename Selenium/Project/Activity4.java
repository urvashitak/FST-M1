package mainselproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity4 {
	@Test
	void getHeading() {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/jobs");
	System.out.println("heading: " + driver.findElement((By.xpath("//h2[contains(text(), 'Quia')]"))).getText());
	String matchhead = "Quia quis non";

			if((driver.findElement((By.xpath("//h2[contains(text(), 'Quia')]"))).getText().equalsIgnoreCase(matchhead))){
		driver.quit();
	      }
}
}
