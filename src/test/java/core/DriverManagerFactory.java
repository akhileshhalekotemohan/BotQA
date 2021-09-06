package core;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType driverType){
        DriverManager driverManager;
        switch (driverType){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case SAFARI:
                driverManager = new SafariDriverManager();
                break;
            case IE:
                driverManager = new IEDriverManager();
                break;
            case FIREFOX:
                driverManager = new FireforxDriverManager();
                break;
                default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}
