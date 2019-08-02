package grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Node2_Instance2 {

    static WebDriver driver;
    static String nodeUrl;

    //MAC runs Safari
    @Test
    public void f() throws MalformedURLException {
        nodeUrl = "http://192.168.1.69:4547/wd/hub";

        DesiredCapabilities capabilities = DesiredCapabilities.safari();
        capabilities.setBrowserName("safari");
        capabilities.setPlatform(Platform.MAC);
        driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
        driver.manage().deleteAllCookies();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
    }



}
