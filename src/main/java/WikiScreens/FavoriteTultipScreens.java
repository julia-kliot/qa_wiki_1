package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class FavoriteTultipScreens extends BaseScreen{
    public FavoriteTultipScreens(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
@FindBy(xpath = "//*[@resource-id='org.wikipedia:id/item_title']")
    MobileElement toMyListLink;

    public ArticleScreen confirmAddition(){
        toMyListLink.click();
        return new ArticleScreen(driver);
    }


}
