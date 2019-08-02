package com.selenium.pageFactory;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SuppressForbidden;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;



public class StepDefs {


    public static void main(String[] args) throws ClassNotFoundException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InterruptedException {

        //Chrome
        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/

        System.setProperty("webdriver.ie.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //calling all the variables from the FBLogonPage class
        Class FBlogon = Class.forName("com.selenium.pages.FBLogonPage");
        PageFactory.initElements(driver, FBlogon);


        //Calling the username variable from FBLogonPage class
        //Inputting the username in the username text
        Field FBuserids = FBlogon.getDeclaredField("username");
        //driver.findElement(By.id("user.id").sendKeys("asda"); --- same mean below

        WebElement FBuseridelement = (WebElement)FBuserids.get(FBuserids);
        FBuseridelement.sendKeys("armanthaque@gmail.com");

        System.out.println(FBuserids);
        System.out.println(FBuseridelement);


        //Calling the password variable from FBLogonPage class
        //Inputing the password in the password text
        Field FBpassword = FBlogon.getDeclaredField("password");
        //driver.findElement(By.id("user.id").sendKeys("asda"); --- same mean below
        WebElement FBpasswordelement = (WebElement)FBpassword.get(FBpassword);
        FBpasswordelement.sendKeys("The_actual_password");

       /* //Calling the Logon variable from FBLogonPage class
        //Clicking on the Logon button
        Field FBLogonbutton = FBlogon.getDeclaredField("Logon");
        //driver.findElement(By.id("u_0_2")).click(); --- same mean below
        WebElement FBButtonelement = (WebElement)FBLogonbutton.get(FBLogonbutton);
        FBButtonelement.click();
*/
        Thread.sleep(3000);





    }

}
