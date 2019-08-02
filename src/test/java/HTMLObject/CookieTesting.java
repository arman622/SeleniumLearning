package HTMLObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CookieTesting {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //driver.findElement(By.name("q")).sendKeys("Hello");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Set<Cookie> websitecookie = driver.manage().getCookies();

        Iterator<Cookie> itecookie = websitecookie.iterator();

        while(itecookie.hasNext()){
           System.out.println("Value of cookie is " + itecookie.next().getValue());
           System.out.println("Name of cookie is " + itecookie.next().getName());
        }


       driver.close();
       driver.quit();
    }


}
