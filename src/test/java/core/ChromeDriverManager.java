package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void createWebDriver() {
        System.setProperty("webdriver.chrome.driver","./src/test/java/resources/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--user-data-dir=/Users/akhileshhalekote/Library/Application Support/Google/Chrome");
        this.driver = new ChromeDriver(chromeOptions);
    }
}
