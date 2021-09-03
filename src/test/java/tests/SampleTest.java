package tests;

import core.DriverManager;
import core.DriverManagerFactory;
import core.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    DriverManager driverManager;
    WebDriver webDriver;

    @Test
    public void navigateToGoogleTest(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        webDriver = driverManager.getWebDriver();
        webDriver.get("https://www.google.com");
        Assert.assertEquals("Google",webDriver.getTitle());
    }
}
