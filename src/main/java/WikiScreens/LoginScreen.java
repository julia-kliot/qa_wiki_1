package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.Auth;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginScreen extends BaseScreen {

    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_username_text']")
    MobileElement userame;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_password_input']")
    MobileElement password;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_button']")
    MobileElement logsButton;

    public HomeScreens logInToWiki(Auth user) {
        type(userame, user.getUsername());
        type(password, user.getPassword());
        logsButton.click();
        return new HomeScreens(driver);

        public LoginScreen loginComplexWithErrorMessage(Auth auth){
            should(emailEditText,20);
            type(emailEditText,auth.getEmail());
            type(passwordEditText, auth.getPassword());
            hideKeyboard();
            loginButton.click();
            return this;
        }
        public LoginScreen checkErrorMessage(String text){
            shouldHave(errorMessage,text,10);
            return this;
        }
        public LoginScreen confirmErrorMessage(){
            okBtn.click();
            return this;
        }
        public boolean isLoginButtonPresent(){
            return isDisplayedWithExp(loginButton);






}


