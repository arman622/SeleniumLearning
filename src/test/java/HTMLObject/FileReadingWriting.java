package HTMLObject;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class FileReadingWriting {

    public static void main(String[] args) throws IOException {

        //INPUT DATA meaning reads data in the file
        /*FileInputStream fi = new FileInputStream("C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\target\\example\\text.properties");
        Properties prop = new Properties();
        prop.load(fi);
        //String appname = prop.getProperty("Name");
        String appurl = prop.getProperty("URL");
        //System.out.println(appname);
        System.out.println(appurl);*/

        ////OUTPUT DATA mean /writing data in the file
        String m = "6789";
        FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir") + "\\text.properties");
        Properties propout = new Properties();
        propout.store(fo, m);
        System.out.println(m);





    }

}
