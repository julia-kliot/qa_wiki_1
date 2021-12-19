package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class TultipArticleItemScreens extends  BaseScreen{
    public TultipArticleItemScreens(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/title']")
    MobileElement addToList;


    public NewWindowScreen addToList(){
        addToList.click();
        return  new NewWindowScreen(driver);
    }

}
