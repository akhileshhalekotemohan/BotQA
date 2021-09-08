package core;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(String driverType){
        DriverManager driverManager;
        DriverType driver;

        if(driverType == null || driverType.toLowerCase().equals("chrome")){
            driver = DriverType.CHROME;
        } else if(driverType.toLowerCase().equals("safari")){
            driver = DriverType.SAFARI;
        } else if(driverType.toLowerCase().equals("firefox")){
            driver = DriverType.FIREFOX;
        } else {
            driver = DriverType.IE;
        }

        switch (driver){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FireforxDriverManager();
                break;
            case SAFARI:
                driverManager = new SafariDriverManager();
                break;
            case IE:
                driverManager = new IEDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}
