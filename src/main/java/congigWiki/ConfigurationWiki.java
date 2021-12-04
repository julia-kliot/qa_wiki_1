package congigWiki;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class ConfigurationWiki {
    protected static AppiumDriver<MobileElement> driver;

    @BeforeMethod
    public void  setUp() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("", "");
        capabilities.setCapability("", "");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1");
        capabilities.setCapability("", "");
        capabilities.setCapability("", ".");

        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app","C:/Users/julia/Documents/QA/Mobile/v.0.0.3.apk");
        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
    @AfterMethod
    public void  tearDown(){
        driver.quit();

    }
}
}
