package com.safebear.auto.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Utils;


public class PnasTests extends BaseTest {


    @Test
    public void checkTitle() {
        //STEP 1 ACTION: Open your web application in the browser
        driver.get(Utils.getUrl());

        //STEP 2 EXPECTED RESULT: Check we're on the login page
        Assert.assertEquals(pnasHomepage.getPageTitle(), "PNAS", "The login page didn't open or something different than expected was found");

    }//checkTitle


    @Test
    public void clickLoginLink() {
        pnasHomepage.clickLogin();
        Assert.assertEquals(pnasHomepage.getPageTitle(), "User account | PNAS", "The login page didn't open or something different than expected was found");

    }//clickLoginLink


    @Test
    public void loginCheck() {
        pnasHomepage.clickLogin();
        pnasLoginPage.enterUsername("thwtestuser77");
        pnasLoginPage.enterPassword("baracuda123");
        pnasLoginPage.clickSubmit();
        pnasHomepage.verifyLogoutText();
        Assert.assertEquals(pnasHomepage.verifyLogoutText(), "Log out", "The Log out link was not found, so user wasn't logged in");
        pnasHomepage.clickLogoutLink();


    }//loginCheck


}//pnasTestsClass

