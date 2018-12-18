package com.safebear.auto.Pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ToolsPageLocators {

    private By successmessageLocator = By.xpath("//div[@class='jumbotron']/h1");

}
