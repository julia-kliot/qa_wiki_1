package testsWiki;

import WikiScreens.HomeScreens;
import WikiScreens.LoginScreen;
import WikiScreens.MainScreens;
import congigWiki.ConfigurationWiki;
import congigWiki.DataProviderMy;
import models.Auth;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends ConfigurationWiki {



    @Test(dataProvider = "loginData", dataProviderClass = DataProviderMy.class)
    public void login(){
        boolean isAccountPresent   = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
                .isAccountPresent();
        Assert.assertTrue(isAccountPresent);


    }
@Test(dataProvider = "loginData", dataProviderClass = DataProviderMy.class)
public void loginDT(Auth user){

    boolean isBTN  = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(user)
                .isAccountPresentAssert();
        //openMenu
    //logOUT
    // .isLoginButtonPresent();
        Assert.assertTrue(isBTN);


}
    @Test(dataProvider = "loginDataCVS", dataProviderClass = DataProviderMy.class)
    public void loginCVS(Auth user){

        boolean isBTN  = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(user)
                .isAccountPresentAssert();
        //openMenu
        //logOUT
        // .isLoginButtonPresent();
        Assert.assertTrue(isBTN);

}
