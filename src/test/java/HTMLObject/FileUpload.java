package HTMLObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FileUpload {

    public static void main(String[] args) throws Exception {

        Robot rb = new Robot();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://megaupload.nz/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"dropzone-area\"]/button")).click();

        Thread.sleep(2000);

        // This is Crt+c (copy)
        StringSelection stringSelection = new StringSelection("C:\\Users\\arman\\Desktop\\Arman_Haque.xls");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);


        Thread.sleep(2000);

        //This is pasting: crt+v
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        //rb.mousePress(K);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        Thread.sleep(2000);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);


        Thread.sleep(10000);

        driver.close();
        driver.quit();



    }
}
