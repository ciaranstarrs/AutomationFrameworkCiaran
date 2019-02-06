package com.safebear.auto.Pages;

import com.safebear.auto.Pages.HighwireLocators.PnasHomepageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;



@RequiredArgsConstructor
public class PnasHomepage {

     PnasHomepageLocators locators
             = new PnasHomepageLocators();

     @NonNull WebDriver driver;


    public String getPageTitle(){

       // System.out.println( driver.getTitle().toString());
        return driver.getTitle().toString();
    }//getpageTitle

    public void clickLogin(){
        driver.findElement(locators.loginLink2).click();
    }

     public String verifyLogoutText(){
        return driver.findElement(locators.logOutLink).getText();
     }

     public void clickLogoutLink(){
         driver.findElement(locators.logOutLink).click();
     }




}




