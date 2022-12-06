package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {
    By userNameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By textMessage = By.xpath("//span[contains(text(),'Products')]");
    By verifySixProducts = By.className("inventory_item");

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getTextMessage(){
        return getTextFromElement(textMessage);
    }
    public int verifyProductsDisplayed(){
        List<WebElement> list = driver.findElements(verifySixProducts);
        return list.size();
    }

}
