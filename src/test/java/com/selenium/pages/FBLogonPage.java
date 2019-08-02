package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class FBLogonPage {

    //username or userid

    @FindBy(how = How.ID, using = "email")
    //@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    public static WebElement username;

    //password
    @FindBy(how =How.ID, using = "pass")
    public static WebElement password;

    //press the login button
    @FindBy(how = How.ID, using = "u_0_2")
    public static WebElement Logon;

    public static void main(String args[]){

        System.out.println(username);

    }


}
