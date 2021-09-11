package tests;

import core.DriverManager;
import core.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestInit {
    private DriverManager driverManager;
    private WebDriver webDriver;
    private final String runningOS = System.getProperty("os");
    private final String runningBrowser = System.getProperty("browser");

    public void TestSetup(){
        driverManager = DriverManagerFactory.getDriverManager(runningBrowser);
        webDriver = driverManager.getWebDriver();
    }

    protected void TestCleanUp(){
        driverManager.quitWebDriver();
    }

    protected void openUrl(String url){
        webDriver.get(url);
    }

    protected void assertTitle(String expected){
        Assert.assertEquals(expected,webDriver.getTitle());
    }
}
