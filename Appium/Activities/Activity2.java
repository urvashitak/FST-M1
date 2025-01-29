package examples;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
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
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("org.chromium.chrome.browser.ChromeTabbedActivity");
        options.noReset();

        // Set the Appium server URL
        URL serverURL = new URL("http://localhost:4723");
        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait= new WebDriverWait(driver, Duration.ofSeconds(15));
        // Open the page in Chrome
        driver.get("https://training-support.net");
    }

    // Test method
    @Test
    public void chromeTest() {
        // Find heading on the page
    	wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath(
        		"android.view.View[@text=\"Training Support\"]"
        )));
        String pageHeading = driver.findElement(AppiumBy.xpath(
        		"android.view.View[@text=\"Training Support\"]"
        )).getText();

        // Print to console
        System.out.println("Heading: " + pageHeading);

        // Find and click the About Us link
        driver.findElement(AppiumBy.accessibilityId("About Us")).click();

        // Find heading of new page and print to console
        //String aboutPageHeading = driver.findElement(AppiumBy.xpath(
            //    "//android.widget.TextView[@text='About Us']"
      //  )).getText();
        String aboutPageHeading = driver.findElement(AppiumBy.xpath(
                "android.view.View[@text=\"Training Support\"]"
        )).getText();
        System.out.println(aboutPageHeading);
    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
