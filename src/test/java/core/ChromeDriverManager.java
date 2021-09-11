package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void createWebDriver(String os) {
        Log.log(ChromeDriverManager.class.getName()+ " Launching Chrome Driver");
        System.setProperty("webdriver.chrome.driver","./src/test/java/resources/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--user-data-dir=/Users/akhileshhalekote/Library/Application Support/Google/Chrome");
        this.driver = new ChromeDriver(chromeOptions);
        Log.log(ChromeDriverManager.class.getName()+ " Chrome Driver launch successful");
    }
}
