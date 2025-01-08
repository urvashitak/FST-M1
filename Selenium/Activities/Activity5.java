package fstselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new FirefoxDriver();
driver.get("https://training-support.net/webelements/dynamic-controls");
System.out.println("page title " + driver.getTitle());
System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());
driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());
driver.quit();

	}
	
	
}
