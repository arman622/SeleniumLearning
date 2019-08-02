package HTMLObject;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;


public class ScreenShotProgram {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //takes a screenshot
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try{
            //send the screenshot to the directory below
            FileUtils.copyFile(src, new File("C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\pictures\\results.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

        Thread.sleep(3000);

        driver.close();
        driver.quit();




    }


}
