package examples;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Activity1 {
    // Driver Declaration
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.calculator2");
        options.setAppActivity(".Calculator");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }

    // Test method
    @Test
    public void multiplyTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("digit_5")).click();
        //driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_5")).click();
      //  driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.accessibilityId("×")).click();
       // driver.findElement(AppiumBy.id("digit_8")).click();
      driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_8")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
      //  String result = driver.findElement(AppiumBy.id("result")).getText();
        String result = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
        // Assertion
        Assert.assertEquals(result, "40");
    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
