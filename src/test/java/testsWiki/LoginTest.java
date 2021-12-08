package testsWiki;

import WikiScreens.HomeScreens;
import WikiScreens.LoginScreen;
import WikiScreens.MainScreens;
import congigWiki.ConfigurationWiki;
import models.Auth;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends ConfigurationWiki {
    @BeforeMethod
    public void preconLogin() {
        new MainScreens(driver)
                .clickSideButton()
                .clickLogWiki();

    }
    @Test
    public void login(){
boolean isAccountPresent = new LoginScreen((driver)
        .logInToWiki(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
        .clickLogsButton()
        .isLAccountPresent();



    }


}
