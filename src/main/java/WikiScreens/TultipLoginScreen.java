package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TultipLoginScreen extends BaseScreen{
    public TultipLoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id= 'org.wikipedia:id/explore_overflow_account_name']")
    MobileElement logWikiButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_log_out']")
    MobileElement logOutButton;
   // @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_account_name']")
    //MobileElement accountName;



    public boolean isLogged() {
         should(logOutButton,20);
        return logOutButton.isDisplayed();
    }

    public TultipLoginScreen isAccountPresentAssert() {
        Assert.assertTrue(logOutButton.isDisplayed());
        return new TultipLoginScreen(driver);
    }
    public LoginScreen clickOnLogInWikiButton() {
       // should(logWikiButton,20);
        logWikiButton.click();
        return new LoginScreen(driver);

    }
    public boolean isLogiButtonPresent(){
        return logWikiButton.isDisplayed();
    }
    public TultipLoginScreen sLogitButtonPresentAssert(){
        Assert.assertTrue(logWikiButton.isDisplayed());
        return this;
    }
    public MainScreens logOut(){
        //should(logOutButton,40);
        logOutButton.click();
        return new MainScreens(driver);
    }
    public MainScreens closeTultip(){
        logWikiButton.click();
        return new MainScreens(driver);
    }

}

