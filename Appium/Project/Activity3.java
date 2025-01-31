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
public class Activity3 {
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
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
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
    public void Task3() {
    	driver.findElement(AppiumBy.accessibilityId("Create a note")).click();
        // wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("New text note")));
         driver.findElement(AppiumBy.accessibilityId("New text note")).click();
         wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/editable_title")));
         driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("Title2");
         driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("shortdes2");
         driver.findElement(AppiumBy.accessibilityId("Reminder")).click();
         driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/menu_text\" and @text=\"Later today\"]")).click();
         driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
         driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();
         driver.findElement(AppiumBy.id("com.google.android.keep:id/drawer_navigation_reminders")).click();
         String title=driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"com.google.android.keep:id/index_note_title\"])[3]")).getText();
         Assert.assertEquals(title, "Title2");
         
}
}
