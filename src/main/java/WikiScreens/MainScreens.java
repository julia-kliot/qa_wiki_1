package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/horizontal_scroll_list_item_text']")
    MobileElement firstArticle;
@FindBy(xpath = "//*[@resource-id='org.wikipedia:id/view_card_header_title']")
MobileElement header;


    public String getDetail() {
        return detailView.getText();

    }

    public SearchScreen clickOnSearchFromMainPage() {
        searchButton.click();
        return new SearchScreen(driver);
    }
    public TultipLoginScreen clickOnFlowButton() {
        should(flowButton,20);
        flowButton.click();
        return new TultipLoginScreen(driver);
    }
    public ArticlePreviewScreens clickOnArticle(){
        firstArticle.click();
        return new ArticlePreviewScreens(driver);
    }




    public boolean isElOnMainPagePres() {
        return header.isDisplayed();

    }
    public MainScreens isElOnMainPagePresAssert(){
        Assert.assertTrue(header.isDisplayed());
        return this;
    }


}






