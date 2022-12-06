package com.saucedemo.sw.pages;

import com.saucedemo.sw.utility.Utility;
import org.openqa.selenium.By;

public class DisplayedOnPage extends Utility {
    By sauceLabsBackpack = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
    By sauceLabsBikeLight = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");
    By sauceLabsBoltTShirt = By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']");
    By sauceLabsFleetJack = By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']");
   By sauceLabsOneSie = By.xpath("(//div[@class='inventory_item_name'])[5]");
    By redTShirt = By.xpath("(//div[@class='inventory_item_name'])[6]");

    public void verifySauceLabsBackpack (){verifyTextFromElements(sauceLabsBackpack,"Sauce Labs Backpack");}
    public void verifySauceLabsBikeLight (){verifyTextFromElements(sauceLabsBikeLight,"Sauce Labs Bike Light");}
    public void verifySauceLabsBoltTShirt (){verifyTextFromElements(sauceLabsBoltTShirt,"Sauce Labs Bolt T-Shirt");}
    public void verifySauceLabsFleetJack (){verifyTextFromElements(sauceLabsFleetJack,"Sauce Labs Fleece Jacket");}
   public void verifySauceLabsOneSie (){verifyTextFromElements(sauceLabsOneSie,"Sauce Labs Onesie");}
    public void verifyRedTShirt (){verifyTextFromElements(redTShirt,"Test.allTheThings() T-Shirt (Red)");}

}
