package HTMLObject;

import java.awt.Robot;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class InspectWebPage {

    public static void main(String[] args) throws InterruptedException, AWTException {

        String exePath="C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);*/

        DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability(CapabilityType.PLATFORM,Platform.ANY );
        cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-web-security");
        Thread.sleep(1000);

        //options.addArguments("start-maximized");
        //Thread.sleep(3000);

        options.addArguments("--auto-open-devtools-for-tabs");
        Thread.sleep(3000);

        options.addExtensions(new File("C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\aXe.crx"));
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        options.addArguments();
        WebDriver driver = new ChromeDriver(cap);


        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        //Actions action = new Actions(driver);

        Robot rb = new Robot();


        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_OPEN_BRACKET);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_OPEN_BRACKET);

        Thread.sleep(3000);


        driver.findElement(By.id("container")).click();

        //driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/nav/div/div/div[1]/button")).click();

       /*for(int i = 0; i<9; i++){
           rb.keyPress(KeyEvent.VK_CONTROL);
           rb.keyPress(KeyEvent.VK_CLOSE_BRACKET);
           Thread.sleep(2000);
       }*/



        //driver.findElement(By.className("analyze-button dqpl-button-primary")).click();

       // Thread.sleep(5000);

       //driver.close();
       //driver.quit();












    }

}
