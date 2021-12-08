package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.Auth;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeScreens extends BaseScreen {
    public HomeScreens(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_account_name']")
    MobileElement accountName;
    @FindBy(xpath = "//*[@class='android.widget.TextView']")
    MobileElement logText;





        public boolean isAccountPresent() {
            return accountName.isDisplayed();

        }
    public HomeScreens isLAccountPresentAssert() {
        Assert.assertTrue(accountName.isDisplayed());
        return this;
    }



}

