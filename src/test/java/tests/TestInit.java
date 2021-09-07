package tests;

import core.DriverManager;
import core.DriverManagerFactory;
import core.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestInit {
    DriverManager driverManager;
    WebDriver webDriver;
    public void TestSetup(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
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
