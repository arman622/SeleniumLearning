package HTMLObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Calender {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.greyhound.com/en");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"datepicker-from\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")).click();





        /*String date = "09/12/2019";

        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/yyyy");
        Date datetobeselected = sdf.parse(date);

        Date currentdate =new Date();

        String month = new SimpleDateFormat("MMMM").format(datetobeselected);
        String year =new SimpleDateFormat("yyyy").format(datetobeselected);
        String day = new SimpleDateFormat("d").format(datetobeselected);

        String monthyeartobeselected = month + "" + year;
        String monthyeardisplayed = driver.findElement(By.xpath("")).getText();*/








    }

}
