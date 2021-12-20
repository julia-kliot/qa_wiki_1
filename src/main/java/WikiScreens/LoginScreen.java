package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.Auth;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginScreen extends BaseScreen {

    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_username_text']")
    MobileElement username;
    @FindBy(xpath = "//*[@resource-id ='org.wikipedia:id/login_password_input']")
    MobileElement password;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_button'] ")
    MobileElement logButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/text_input_password_toggle']")
    MobileElement toggleButton;


    public MainScreens fillInLoginForm(Auth user) {
        //should(username,20);
        type(username, user.getUsername());
        should(username, 40);
        toggleButton.click();
        //type(password, user.getPassword());
        password.click();
        //  TouchAction <?> touchAction = new TouchAction<>(driver);
        Actions action = new Actions(driver);
        action.sendKeys(user.getPassword()).perform();
        logButton.click();
        return new MainScreens(driver);
    }
}

