package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePreviewScreens extends BaseScreen {
    public ArticlePreviewScreens(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/view_list_card_item_menu']")
    MobileElement articleItem;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/view_list_card_item_title']")
    MobileElement articleName;

    public TultipArticleItemScreens clickOnArticleItem() {
        articleItem.click();
        return new TultipArticleItemScreens(driver);

    }
    public ArticleScreen addArticle(){
        articleName.click();
        return new ArticleScreen(driver);
    }

}
