package com.safebear.auto.Pages.HighwireLocators;

import lombok.Data;
import org.openqa.selenium.By;

/**
 * Created by cstarrs on 1/22/2019.
 */
@Data
public class PnasLoginPageLocators{

    private By username = By.xpath(".//*[@id='edit-name']");

    public By password = By.xpath(".//*[@id='edit-pass']");

    public By sumbit = By.xpath(".//*[@id='edit-submit']");











}
