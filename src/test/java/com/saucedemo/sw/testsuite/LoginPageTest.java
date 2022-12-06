package com.saucedemo.sw.testsuite;


import com.saucedemo.sw.pages.DisplayedOnPage;
import com.saucedemo.sw.pages.LoginPage;
import com.saucedemo.sw.testbase.BaseTest;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DisplayedOnPage displayedOnPage = new DisplayedOnPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserNameField("standard_user");
        loginPage.enterPasswordField("secret_sauce");
        loginPage.clickOnLoginButton();
        loginPage.verifyTextMessage();
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserNameField("standard_user");
        loginPage.enterPasswordField("secret_sauce");
        loginPage.clickOnLoginButton();
        displayedOnPage.verifySauceLabsBoltTShirt();
        displayedOnPage.verifySauceLabsBikeLight();
        displayedOnPage.verifySauceLabsBoltTShirt();
        displayedOnPage.verifySauceLabsFleetJack();
        displayedOnPage.verifySauceLabsOneSie();
        displayedOnPage.verifyRedTShirt();




    }
    }