package tests;

import core.DriverManager;
import core.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestInit {
    private DriverManager driverManager;
    protected WebDriver webDriver;
    private final String runningOS = System.getProperty("os");
    private final String runningBrowser = System.getProperty("browser");
    protected final String websiteUrl = "https://gallant-fermat-d0dc04.netlify.app";

    public void TestSetup(){
        driverManager = DriverManagerFactory.getDriverManager(runningBrowser,runningOS);
        webDriver = driverManager.getWebDriver(runningOS);
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
