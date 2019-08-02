package HTMLObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultiTab {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/List_of_most-subscribed_YouTube_channels");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        Set<String> winid = driver.getWindowHandles();

        System.out.println(winid.size());

        Iterator<String> winitr = winid.iterator();
        String mainwin = winitr.next();
        String popup = winitr.next();

        driver.switchTo().window(mainwin);

        if(driver.findElement(By.linkText("Report a fraud or scam")).isDisplayed()){
            driver.findElement(By.linkText("Report a fraud or scam")).click();
            driver.switchTo().window(mainwin);
        } else{
            driver.switchTo().window(popup);
            driver.findElement(By.linkText("Report a fraud or scam")).click();
        }

    }
}
