package HTMLObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Scroll {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.yahoo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Thread.sleep(1000);

        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 1000)", "");


        Thread.sleep(5000);

        driver.close();
        driver.quit();




    }
}


