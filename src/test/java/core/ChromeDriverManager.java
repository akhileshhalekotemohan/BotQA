package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void createWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //ChromeOptions
        
        this.driver = new ChromeDriver();

    }
}
