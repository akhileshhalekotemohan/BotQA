package core;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariDriverManager extends DriverManager{

    @Override
    protected void createWebDriver() {
        SafariOptions safariOptions = new SafariOptions();
        this.driver = new SafariDriver(safariOptions);

    }
}
