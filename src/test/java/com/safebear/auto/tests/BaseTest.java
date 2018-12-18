package com.safebear.auto.tests;

import com.safebear.auto.Pages.LoginPage;
import com.safebear.auto.Pages.ToolsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Utils;

public abstract class BaseTest {


    WebDriver driver;
    protected LoginPage loginPage;
    protected ToolsPage toolsPage;

    @BeforeTest
    public void setUp(){
        driver = Utils.getDriver();
        loginPage = new LoginPage(driver);
        toolsPage = new ToolsPage(driver);
    }

    @AfterTest
    public void tearDown() throws InterruptedException {


        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep", "2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        driver.quit();
    }










}
