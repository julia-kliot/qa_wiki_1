package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class MainScreens extends BaseScreen{
    public MainScreens(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "")
    MobileElement versionTextView;


    }
}
