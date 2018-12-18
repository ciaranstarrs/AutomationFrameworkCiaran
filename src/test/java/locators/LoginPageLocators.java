package locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginBttonLoctaor = By.id ("enter");


}
