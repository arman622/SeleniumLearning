package HTMLObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CustomizingChrome {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized");
        //options.setCapability(CapabilityType.);

        /*ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_settings.popups", 0);
        options.setExperimentalOption("prefs", prefs);

*/




        Thread.sleep(5000);


        driver.close();
        driver.quit();
    }

}
