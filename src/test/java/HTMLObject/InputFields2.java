package HTMLObject;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class InputFields2 extends RemoteWebDriver {

    public static String destDir;
    public static DateFormat dateFormat;

    /*public static void takeScreenShot() throws IOException {

        //directory
        destDir = "screenshots";

        //capturing screenshot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //set date
        dateFormat =new SimpleDateFormat("dd-MM-YYYY_hh_mm_ssaa");

        //create folder
        new File(destDir).mkdir();

        String destFile = dateFormat.format(new Date()) + ".png";

        FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
    }
    */

    public static void main(String[] args) throws InterruptedException, IOException {

        ChromeOptions options = new ChromeOptions();
        ChromeOptions haque = options.addArguments("--disable-notifications");
        String arman = System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("armanthaque@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1001122");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(5000);


        //Method one for screenshot
       /* try{
            System.out.println(driver.findElement(By.className("_1vp5")).getText());
        }catch (Exception e){
            System.out.println("Something went wrong.");
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\pictures\\results.png"));
             //e.printStackTrace();
        }
        */

       //Method two for screenshot
        try{
            System.out.println(driver.findElement(By.className("_1vp5")).getText());
        }catch (Exception e){
            System.out.println("Something went wrong.");

            //directory
            destDir = "screenshots";

            //capturing screenshot
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            //set date
            dateFormat =new SimpleDateFormat("dd-MM-YYYY_hh_mm_ssaa");

            //create folder
            new File(destDir).mkdir();

            String destFile = dateFormat.format(new Date()) + ".png";

            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
        }










        //SCROLL METHOD
        /*JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 150)", "");
*/


        /*Thread.sleep(3000);

        driver.close();
        driver.quit();*/



    }
}
