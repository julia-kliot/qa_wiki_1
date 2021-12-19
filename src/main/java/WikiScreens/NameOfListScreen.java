package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class NameOfListScreen extends BaseScreen{
    public NameOfListScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
@FindBy(xpath = "//*[@resource-id='org.wikipedia:id/onboarding_button']")
    MobileElement okButton;

    public ArticlePreviewScreens confirmCreation(){
       //hould(okButton,20);
        okButton.click();
        return new ArticlePreviewScreens(driver);
    }
}
