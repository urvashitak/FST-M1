package mainselproject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Activity7 {
@Test
public void formFill() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/jobs/");
	//driver.findElement(By.id("menu-item-24")).click();
	String pageheader = driver.getTitle();
	System.out.println(pageheader);
	
	driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a")).click();
	
	WebElement emailid = driver.findElement(By.xpath("//*[@id=\"create_account_email\"]"));
	emailid.click();
	emailid.sendKeys("uru@gmail.com");
	
	WebElement jobtitle = driver.findElement(By.xpath("//*[@id=\"job_title\"]"));
	jobtitle.click();
	jobtitle.sendKeys(" Manager IBM");
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  driver.switchTo().frame(driver.findElement(By.id("job_description_ifr"))); // Switch to the iframe
	//WebElement description = driver.findElement(By.xpath("/html"));
	  WebElement description = driver.findElement(By.id("tinymce"));
	 wait.until(ExpectedConditions.visibilityOf(description));
	//description.click();
	description.sendKeys("descrition");
	driver.switchTo().defaultContent(); // Switch back to the main content
	
	
	WebElement email = driver.findElement(By.xpath("//*[@id=\"application\"]"));
	email.click();
	email.sendKeys("www.tranuru.com");
	
	WebElement companyname = driver.findElement(By.xpath("//*[@id=\"company_name\"]"));
	companyname.click();
	companyname.sendKeys("IBMP");
	
	
	driver.findElement(By.xpath("//*[@id=\"submit-job-form\"]/p/input[4]")).click();
	
	
	WebElement inputBox = driver.findElement(By.id("search_keywords"));
	inputBox.click();
	inputBox.sendKeys ("Manager IBM");
	driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]/a/img"));
	driver.findElement(By.xpath("//*[@id=\"post-8368\"]/div/div/div/div[3]/input")).click();
	WebElement emailid1 = driver.findElement(By.xpath("//*[@id=\"post-8368\"]/div/div/div/div[3]/div/p/a"));
	System.out.println(emailid1);
	
	//driver.quit();
}
}

