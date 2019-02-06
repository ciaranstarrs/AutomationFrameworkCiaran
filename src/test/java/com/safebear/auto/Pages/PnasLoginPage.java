package com.safebear.auto.Pages;

import com.safebear.auto.Pages.HighwireLocators.PnasLoginPageLocators;
import com.safebear.auto.Pages.locators.LoginPageLocators;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by cstarrs on 1/22/2019.
 */

@RequiredArgsConstructor
public class PnasLoginPage {

    PnasLoginPageLocators locators = new PnasLoginPageLocators();

    @NonNull WebDriver driver;

    public String getPageTitle(){

        // System.out.println( driver.getTitle().toString());
        return driver.getTitle().toString();
    }//getpageTitle

public void enterUsername(){
        driver.findElement(locators.getUsername()).sendKeys("putUsernameHere");
}//enterUsername

public void enterPassword(){
    driver.findElement(locators.getPassword()).sendKeys("putPasswordHere");
}//enterPassword

public void clickSubmit(){
    driver.findElement(locators.getSumbit()).click();
}



 






}
