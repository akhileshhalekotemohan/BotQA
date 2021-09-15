package core;
import utils.Log;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(String driverType, String os){
        DriverManager driverManager;
        DriverType driver;
        Log.log(DriverManagerFactory.class.getName()+ " Choosing appropriate driver as per the request");
        if(driverType == null || driverType.equalsIgnoreCase("chrome")){
            driver = DriverType.CHROME;
        } else if(driverType.equalsIgnoreCase("safari")){
            driver = DriverType.SAFARI;
        } else if(driverType.equalsIgnoreCase("firefox")){
            driver = DriverType.FIREFOX;
        } else {
            driver = DriverType.IE;
        }

        Log.log(DriverManagerFactory.class.getName()+ " Driver init in progress....");
        switch (driver){
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
        Log.log(DriverManagerFactory.class.getName()+ " Driver Launch has succeeded");
        return driverManager;
    }
}
