package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ArticleScreen extends BaseScreen{
    public ArticleScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='android.widget.ImageView']")
    MobileElement addToFavoriteButton;
    @FindBy(xpath = "//*[@class='android.widget.FrameLayout']")
    MobileElement confermedAddition;

    public FavoriteTultipScreens addToFavorite(){
        addToFavoriteButton.click();
        return new FavoriteTultipScreens(driver);
    }
    public boolean isConfirmed() {
        return confermedAddition.isDisplayed();

    }
    public ArticleScreen isConfirmedAssert(){
        Assert.assertTrue(confermedAddition.isDisplayed());
        return this;
    }
}
