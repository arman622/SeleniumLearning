package HTMLObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class MultipleBrowsers {
    public static void main(String[] args) throws InterruptedException {

        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/

        /*System.setProperty("webdriver.ie.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\IEDriverServer.exe");

        DesiredCapabilities capabilities  = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.IE);
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        capabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, true);
        capabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
        capabilities.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
        capabilities.setJavascriptEnabled(false);

        WebDriver driver = new InternetExplorerDriver(capabilities);
        driver.get("https://www.yahoo.com/");*/

       /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        Thread.sleep(5000);

        driver.close();
        driver.quit();

        */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");


        DesiredCapabilities capabilities  = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.ANY);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--diaable-web-chase.com");
        options.addArguments("--headless");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("https://www.yahoo.com/");
        driver.findElement(By.id("uh-search-box")).sendKeys("Arman22");



    }
}
