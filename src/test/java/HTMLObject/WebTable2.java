package HTMLObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTable2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/List_of_most-subscribed_YouTube_channels");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement table = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[1]"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));

        for (int i=0; i<tableRows.size();i++){
            List<WebElement> tablecells = tableRows.get(i).findElements(By.tagName("td"));

            for(int j=0; j<tablecells.size();j++){
            System.out.print(tablecells.get(j).getText());
            }
            System.out.println();

        }
        driver.quit();
    }

}
