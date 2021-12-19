package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class CreateListScreen extends BaseScreen{
    public CreateListScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

@FindBy(xpath = "//*[@resource-id='org.wikipedia:id/create_button']")
    MobileElement createButton;

    public NameOfListScreen clickCreateButton(){
        createButton.click();
        return new NameOfListScreen(driver);
    }
}
