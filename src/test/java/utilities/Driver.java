package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--incognito");
                    driver = new ChromeDriver(options);
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Browser type is invalid");
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
