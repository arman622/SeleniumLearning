package HTMLObject;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class JavaScriptExcutor {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        //driver.findElement(By.name("q")).sendKeys("Hello");
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("document.getElementById('uh-search-box').value='q1testing'");
        //js.executeScript("document.getElementByName('q').value='q1testing'");
        //js.executeScript("document.getElementByXPath('//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input').value='q1testing'");

        //driver.findElement(ByXPath)





        Thread.sleep(5000);


        driver.close();
        driver.quit();
    }

}
