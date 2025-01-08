package fstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("page title " + driver.getTitle());
		System.out.println(driver.findElement(By.id("checkbox")).isSelected());
		driver.findElement(By.id("checkbox")).click();
		System.out.println(driver.findElement(By.id("checkbox")).isSelected());
		driver.quit();

			}
			

	}


