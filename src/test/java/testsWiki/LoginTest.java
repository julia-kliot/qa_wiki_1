package testsWiki;

import WikiScreens.HomeScreens;
import WikiScreens.LoginScreen;
import WikiScreens.MainScreens;
import congigWiki.ConfigurationWiki;
import congigWiki.DataProviderMy;
import models.Auth;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends ConfigurationWiki {

    @Test
    public void loginTest() {
        boolean isLogiButtonPresent = new MainScreens(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
                .clickOnFlowButton()
                .logOut()
                .clickOnFlowButton()
                .isLogiButtonPresent();

        Assert.assertTrue(isLogiButtonPresent);


    }


    //@Test (dataProvider = "loginData", dataProviderClass = DataProviderMy.class)
    @Test (enabled = false)
    public void loginDT(Auth user) {
        boolean isLogiButtonPresent = new MainScreens(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(user)
                .clickOnFlowButton()
                .isAccountPresentAssert()
                .logOut()
                .clickOnFlowButton()
                .isLogiButtonPresent();

        Assert.assertTrue(isLogiButtonPresent);


    }

    @Test (dataProvider = "loginDataCvs", dataProviderClass = DataProviderMy.class)
    public void loginDataFromCSV(Auth user) {
        boolean isLogiButtonPresent = new MainScreens(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(user)
                .clickOnFlowButton()
                .isAccountPresentAssert()
                .logOut()
                .clickOnFlowButton()
                .isLogiButtonPresent();

        Assert.assertTrue(isLogiButtonPresent);


    }
}
