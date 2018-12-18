package com.safebear.auto.Pages;

import com.safebear.auto.Pages.locators.LoginPageLocators;
import com.safebear.auto.Pages.locators.ToolsPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class LoginPage {

    LoginPageLocators locators = new LoginPageLocators();


    @NonNull WebDriver driver;

    public String getPageTitle(){


        return driver.getTitle().toString();
    }//getpageTitle

    public void enterUsername(String uname){
        driver.findElement(locators.getUsernameLocator()).sendKeys(uname);

    }//enterUsername

    public void enterPassword(String pword){
        driver.findElement(locators.getPasswordLocator()).sendKeys(pword);
    }

    public void clickLoginButton(){
        driver.findElement(locators.getLoginBttonLoctaor()).click();
    }

   // public void getErrorMessage() {driver.findElement(locators.getLoginNotSuccessfulMessage().ge









}

