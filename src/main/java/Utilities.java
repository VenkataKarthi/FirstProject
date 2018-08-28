
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.remote.DesiredCapabilities;

public class Utilities {
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/venkatkarthi/Downloads/chromedriver");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability("marionette", true);

        WebDriver driver = new ChromeDriver(desiredCapabilities);
        return driver;
    }
}