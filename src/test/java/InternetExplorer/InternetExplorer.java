package InternetExplorer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.ie.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\IEDriverServer32.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("armanthaque@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1001122");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"u_0_3\"]")).click();
        Thread.sleep(5000);


    }
}
