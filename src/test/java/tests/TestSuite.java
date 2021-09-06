package tests;

import core.DriverManagerFactory;
import core.DriverManager;
import core.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite {
    DriverManager driverManager;
    WebDriver webDriver;

    @Test
    public void navigateToGoogleTest(){
        webDriver.get("https://www.google.com");
        Assert.assertEquals("Google",webDriver.getTitle());
    }

    @BeforeTest
    public void init(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        webDriver = driverManager.getWebDriver();
    }

    @AfterTest
    public void cleanup(){
        driverManager.quitWebDriver();
    }
}
