package HTMLObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class InputFields extends RemoteWebDriver {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException {

        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe"))
                .usingAnyFreePort()
                .build();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        service.start();

        driver.get("https://www.google.com/");

        service.stop();


    }
}

