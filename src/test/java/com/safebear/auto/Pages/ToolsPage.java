package com.safebear.auto.Pages;

import com.safebear.auto.Pages.locators.ToolsPageLocators;
import com.sun.istack.internal.NotNull;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class ToolsPage {

    ToolsPageLocators locator = new ToolsPageLocators();

    @NonNull WebDriver driver;

    public String getPageTitle(){


        return driver.getTitle().toString();
    }//getpageTitle

    public String getSuccessMessageText(){
        return driver.findElement(locator.getSuccessmessageLocator()).getText();
    }





}
