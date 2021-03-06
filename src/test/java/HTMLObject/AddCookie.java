package HTMLObject;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AddCookie {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //driver.findElement(By.name("q")).sendKeys("Hello");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Cookie newcookie = new Cookie("Arman", "12345");
        driver.manage().addCookie(newcookie);
        Set<Cookie> websitecookie = driver.manage().getCookies();
        Iterator<Cookie> itecookie = websitecookie.iterator();

        while(itecookie.hasNext()){

            Cookie ck = itecookie.next();

            System.out.println("Name of cookie is " + ck.getName());
            System.out.println("Value of cookie is " + ck.getValue());


            //System.out.println("Value of cookie is " + itecookie.next().getName());
            //System.out.println("Value of cookie is " + itecookie.next().getValue());

        }

        Thread.sleep(3000);


        driver.close();
        driver.quit();
    }

}
