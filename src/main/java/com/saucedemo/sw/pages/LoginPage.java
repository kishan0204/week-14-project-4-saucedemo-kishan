package com.saucedemo.sw.pages;


import com.saucedemo.sw.utility.Utility;
import org.openqa.selenium.By;


public class LoginPage extends Utility {
    By nameField = By.xpath("//input[@id='user-name']");
    By passwordField = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");
    By textMessage =By.xpath("//span[normalize-space()='Products']");

    public void enterUserNameField(String username){sendTextToElement(nameField , username);}
    public void enterPasswordField (String password){sendTextToElement(passwordField , password);}
    public void clickOnLoginButton(){clickOnElement(loginButton);}
    public void verifyTextMessage(){verifyTextFromElements(textMessage,"PRODUCTS");}

}
