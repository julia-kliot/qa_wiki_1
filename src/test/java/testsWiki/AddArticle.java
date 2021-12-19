package testsWiki;

import WikiScreens.MainScreens;
import WikiScreens.TultipLoginScreen;
import congigWiki.ConfigurationWiki;
import models.Auth;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddArticle extends ConfigurationWiki {
    @BeforeMethod
    public void loginWithouLogout(){
        boolean isLogged = new MainScreens(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
                .clickOnFlowButton()
                .isLogged();

        Assert.assertTrue(isLogged);
    }
    @Test
    public void firstlyAddToList(){
      boolean isConfirmed = new TultipLoginScreen(driver)
                .closeTultip()
                .clickOnArticle()
                .clickOnArticleItem()
                .addToList()
              . clickGotIt()
              .confirmCreation()
                .addArticle()
             //.clickCreateButton()
              .addToFavorite()
                .confirmAddition()
                .isConfirmed();
        Assert.assertTrue(isConfirmed);




    }
}
