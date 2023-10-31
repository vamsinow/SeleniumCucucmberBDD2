package StepDefinitions.Hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSingleton {
    public static ThreadLocal<WebDriver> driverThreadLocal = ThreadLocal.withInitial(() -> null);

    public static WebDriver getDriver() {
        if (driverThreadLocal.get() == null) {
            String browser = PropertiesFile.getProperties().getProperty("browser");

            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driverThreadLocal.set(new ChromeDriver());
            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driverThreadLocal.set(new FirefoxDriver());
            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driverThreadLocal.set(new EdgeDriver());
            }

            driverThreadLocal.get().manage().window().maximize();
            driverThreadLocal.get().get("https://www.lenskart.com/");
        }
        return driverThreadLocal.get();
    }
}
