package HTMLObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AJaxAutoSuggestion {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("Hello");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li"));


       /* System.out.println(options.size());

        for (int i =0; i<options.size(); i++){
            System.out.println(options.get(i).getText());
        }
*/

        Iterator<WebElement> iteoptions = options.iterator();

       while(iteoptions.hasNext()){
           WebElement element = iteoptions.next();
           System.out.println(element.getText());
       }

        driver.close();
    }

}
