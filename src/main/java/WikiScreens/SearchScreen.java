package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class SearchScreen extends BaseScreen {

    public SearchScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@class='android.widget.EditText']")
    MobileElement textEditText;
    @FindBy(how = How.XPATH, using = "//*[@resource-id='org.wikipedia:id/search_src_text']")
    MobileElement liner;

    public SearchScreen fillInText(String text) {
        type(textEditText, text);
        return this;
    }

    public SearchScreen closeBoard() {
        hideKeyboard();
        return this;
    }

    public boolean isSearchPresent() {
        return liner.isDisplayed();

    }
    public SearchScreen isLinerPresentAssert(){
        Assert.assertTrue(liner.isDisplayed());
        return this;
    }

}




