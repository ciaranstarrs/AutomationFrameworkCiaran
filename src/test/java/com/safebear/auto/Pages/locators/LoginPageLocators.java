package com.safebear.auto.Pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginBttonLoctaor = By.id ("enter");
    private By loginNotSuccessfulMessage = By.xpath("//p[@id='rejectLogin']");


}
