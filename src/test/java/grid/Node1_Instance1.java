package grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Node1_Instance1 {
    static WebDriver driver;
    static String nodeUrl;

    //Windows For IE Browser
    @Test
    public void f() throws MalformedURLException {
        nodeUrl = "http://192.168.1.221:4547/wd/hub";

        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setBrowserName("internet explorer");
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
        driver.manage().deleteAllCookies();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        //driver.findElement(By.linkText("Today's Deals")).click();

    }
}
