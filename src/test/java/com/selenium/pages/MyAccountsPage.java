package com.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountsPage {

    @FindBy(how = How.ID, using = "email")
    //@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    public static WebElement myAccount;
}
