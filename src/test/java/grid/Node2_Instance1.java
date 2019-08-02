package grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Node2_Instance1 {

    static WebDriver driver;
    static String nodeUrl;


    //MAC runs chrome
    @Test
    public void f() throws MalformedURLException {
        nodeUrl = "http://192.168.1.69:4547/wd/hub";

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.MAC);
        driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
        driver.manage().deleteAllCookies();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }

    /*public void f() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.MAC);

        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);

        String nodeUrl = "http://192.168.1.69:4547/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(nodeUrl), options);

        driver.manage().deleteAllCookies();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45L, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

    }*/
}

