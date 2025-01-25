package mainselproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Activity1{
	@Test
void launchurl() {
WebDriver driver= new FirefoxDriver();
driver.get("https://alchemy.hguy.co/jobs");
System.out.println("Title " + driver.getTitle());
String matchurl = "Alchemy Jobs – Job Board Application";

		if((driver.getTitle()).equalsIgnoreCase(matchurl)){
			System.out.println("title matches");
	driver.quit();
      }
}
}