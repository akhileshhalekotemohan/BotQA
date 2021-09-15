package core;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.Log;


public class FireforxDriverManager extends DriverManager {

    @Override
    protected void createWebDriver(String os) {
        Log.log(FireforxDriverManager.class.getName()+ " Launching Firefox driver");
        System.setProperty("webdriver.gecko.driver","./src/test/java/resources/geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        this.driver = new FirefoxDriver(firefoxOptions);
        Log.log(FireforxDriverManager.class.getName()+ " Firefox driver launch successful");
    }
}

