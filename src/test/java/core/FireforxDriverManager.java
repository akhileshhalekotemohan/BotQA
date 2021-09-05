package core;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireforxDriverManager extends DriverManager {

    @Override
    protected void createWebDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        this.driver = new FirefoxDriver(firefoxOptions);
    }
}

