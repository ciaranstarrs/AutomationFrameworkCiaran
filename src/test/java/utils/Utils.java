package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {

//    private static final String URL = System.getProperty("url", "http://localhost:8080");
    private static final String URL = System.getProperty("url", "https://www.pnas.org");
    private static final String BROWSER = System.getProperty("browser", "chrome");



    public static String getUrl(){
        return URL;
    }

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1366,768");

        switch (BROWSER){
            case "chrome":
                return new ChromeDriver(options);
            case "headless":
                    options.addArguments("headless","disable-gpu");
                            return new ChromeDriver(options);
            case "firefox":
                return new FirefoxDriver();
            default:
                return new ChromeDriver();
        }
    }










}
