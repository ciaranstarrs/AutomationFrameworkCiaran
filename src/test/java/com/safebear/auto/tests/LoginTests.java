package com.safebear.auto.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Utils;

public class LoginTests extends BaseTest {


    @Test
    public void LoginTest() {
        //STEP 1 ACTION: Open your web appplication in the browser
        driver.get(Utils.getUrl());
        //STEP 1 EXPECTED RESULT: Check we're on the login page
        Assert.assertEquals(loginPage.getPageTitle(), "Login Page", "The login page didn't open or something different than expected was found");
        //Step2 ACTION Enter username and password
        loginPage.enterUsername("tester");
        loginPage.enterPassword("letmein");
        //Step 3 ACTION: press the login button
        loginPage.clickLoginButton();
        //Step 3 EXPECTED RESULT: Check that we're now on the tools page
        Assert.assertEquals(toolsPage.getPageTitle(), "Tools Page", "The tools page didn't open or something different to expected was found");
        Assert.assertTrue(toolsPage.getSuccessMessageText().contains("Welcome"));

    }


    @Test
    public void invalidLogin() {
        driver.get(Utils.getUrl());
        //STEP 1 EXPECTED RESULT: Check we're on the login page
        Assert.assertEquals(loginPage.getPageTitle(), "Login Page", "The login page didn't open or something different than expected was found");
        //Step2 ACTION Enter username and password
        loginPage.enterUsername("Tester777");
        loginPage.enterPassword("letmein999");
        //Step 3 ACTION: press the login button
        loginPage.clickLoginButton();
        //Step 3 EXPECTED RESULT: Check that we're now not on the tools page
        Assert.assertNotEquals(toolsPage.getPageTitle(), "Tools Page", "User is getting to tools page with an invalid login");



    }


}//class
