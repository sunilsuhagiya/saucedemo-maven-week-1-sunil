package com.saucedemo.testsuite;



import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LoginPageTest extends BaseTest {

     LoginPage loginPage = new LoginPage();


    /** Dry Test Run
     @Test
     public void test(){
     System.out.println("saucedemo");
     }
     */

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
         loginPage.enterUserName("standard_user");
         loginPage.enterPassword("secret_sauce");
         loginPage.clickOnLoginButton();
         String expectedMessage = "PRODUCTS";
         Assert.assertEquals(loginPage.getTextMessage(),expectedMessage,"Products text not displayed");
         }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        int expectedNumberOfProducts =6;
        Assert.assertEquals(loginPage.verifyProductsDisplayed(),expectedNumberOfProducts,"6 Products are not displayed");

    }

}
