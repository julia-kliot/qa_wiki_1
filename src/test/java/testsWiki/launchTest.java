package testsWiki;

import WikiScreens.MainScreens;
import congigWiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;

public class klaunchTest extends ConfigurationWiki {
    @Test
    public void launchTest2(){
        String detail = new MainScreens(driver).getDetail();
        Assert.assertEquals(detail, "In the news");

    }
}
