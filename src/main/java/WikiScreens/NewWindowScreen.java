package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class NewWindowScreen extends BaseScreen{
    public NewWindowScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[@resource-id='org.wikipedia:id/design_bottom_sheet']")
    MobileElement gotIt;

    public NameOfListScreen clickGotIt(){
        gotIt.click();
        return new NameOfListScreen(driver);
    }
}
