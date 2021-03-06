package test.java.core;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import test.java.utils.Log;

public class IEDriverManager extends DriverManager{


    @Override
    protected void createWebDriver(String os) {
        Log.log(IEDriverManager.class.getName()+ " Launching IE driver");
        System.setProperty("webdriver.chrome.driver","./src/test/java/resources/IEDriverServer.exe");
        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        this.driver = new InternetExplorerDriver(internetExplorerOptions);
        Log.log(IEDriverManager.class.getName()+ " IE Driver launch successful");
    }
}
