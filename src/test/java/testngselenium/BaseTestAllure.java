package testngselenium;


import org.openqa.selenium.WebDriver;

public class BaseTestAllure {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driverRef) {
        driver.set(driverRef);
    }
}