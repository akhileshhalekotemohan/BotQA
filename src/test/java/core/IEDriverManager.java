package core;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class IEDriverManager extends DriverManager{


    @Override
    protected void createWebDriver() {
        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        this.driver = new InternetExplorerDriver(internetExplorerOptions);
    }
}