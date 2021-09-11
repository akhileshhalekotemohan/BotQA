package core;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(String driverType, String os){
        DriverManager driverManager;
        DriverType driver;
        Log.log(DriverManagerFactory.class.getName()+ " Choosing appropriate driver as per the request");
        if(driverType == null || driverType.toLowerCase().equals("chrome")){
            driver = DriverType.CHROME;
        } else if(driverType.toLowerCase().equals("safari")){
            driver = DriverType.SAFARI;
        } else if(driverType.toLowerCase().equals("firefox")){
            driver = DriverType.FIREFOX;
        } else {
            driver = DriverType.IE;
        }

        Log.log(DriverManagerFactory.class.getName()+ " Driver init in progress....");
        switch (driver){
            case CHROME:
                driverManager = new ChromeDriverManager(os);
                break;
            case FIREFOX:
                driverManager = new FireforxDriverManager(os);
                break;
            case SAFARI:
                driverManager = new SafariDriverManager(os);
                break;
            case IE:
                driverManager = new IEDriverManager(os);
                break;
            default:
                driverManager = new ChromeDriverManager(os);
                break;
        }
        Log.log(DriverManagerFactory.class.getName()+ " Driver Launch has succeeded");
        return driverManager;
    }
}
