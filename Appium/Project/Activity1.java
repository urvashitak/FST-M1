package ProjectActivities;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
	// Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}
 // Test method
    @Test
    public void Task1() {
        // Perform the calculation
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.className("android.widget.EditText")));
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Tasks");
      driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
      driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
      wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")));
      driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Keep");
    driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
    driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
    wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")));
    driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete the second Activity Google Keep");
  driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

        // Find the result
      //  String result = driver.findElement(AppiumBy.id("result")).getText();
        String task1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete Activity with Google Tasks\"]")).getText();
        Assert.assertEquals(task1, "Complete Activity with Google Tasks");
        String task2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete Activity with Google Keep\"]")).getText();
        Assert.assertEquals(task2, "Complete Activity with Google Keep");
        String task3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete the second Activity Google Keep\"]")).getText();
        Assert.assertEquals(task3, "Complete the second Activity Google Keep");
    }
}
