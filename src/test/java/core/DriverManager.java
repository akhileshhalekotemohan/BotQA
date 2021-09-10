package core;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public abstract class DriverManager {
    protected WebDriver driver;

    protected abstract void createWebDriver();

    public void quitWebDriver(){
        Log.log(DriverManager.class.getName()+ " Quitting driver....Bye!");
        if(null!=driver){
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getWebDriver(){
        Log.log(DriverManager.class.getName()+ " Initializing driver...");
        if(null==driver){
            createWebDriver();
        }
        Log.log(DriverManager.class.getName()+ " Changing driver settings...");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Log.log(DriverManager.class.getName()+ " Changing driver settings done!!");
        return driver;
    }

}
