package core;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class DriverManager {
    protected WebDriver driver;

    protected abstract void createWebDriver();

    public void quitWebDriver(){
        if(null!=driver){
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getWebDriver(){
        if(null==driver){
            createWebDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;
    }

}
