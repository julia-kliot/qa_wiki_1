package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class MainScreens extends BaseScreen {
    public MainScreens(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/view_card_header_title']")
    MobileElement detailView;
    @FindBy(xpath = "//*[@class='android.widget.ImageView']")
    MobileElement searchButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/menu_overflow_button']")
    MobileElement flowButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_account_name'")
    MobileElement logWikiButton;

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_account_name']")
    MobileElement accountName;



    public String getDetail() {
        return detailView.getText();

    }

    public MainScreens clickSideButton() {
        flowButton.click();
        return this;
    }

    public SearchScreen clickSearchButton() {
        searchButton.click();
        return new SearchScreen(driver);

    }

    public LoginScreen clickLogWiki() {
        logWikiButton.click();
        return new LoginScreen(driver);
    }





    }




    }

}

