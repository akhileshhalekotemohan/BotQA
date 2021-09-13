package core;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariDriverManager extends DriverManager{

    @Override
    protected void createWebDriver(String os) {
        Log.log(SafariDriverManager.class.getName()+ " Launching Safari driver");
        SafariOptions safariOptions = new SafariOptions();
        this.driver = new SafariDriver(safariOptions);
        Log.log(SafariDriverManager.class.getName()+ " Safari driver launch successful");

    }
}
