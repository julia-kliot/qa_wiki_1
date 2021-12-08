package testsWiki;

import WikiScreens.MainScreens;
import WikiScreens.SearchScreen;
import congigWiki.ConfigurationWiki;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchArticle  extends ConfigurationWiki {
    @BeforeMethod
    public void  preConditions(){
        new MainScreens(driver)
                .clickSearchButton();
    }

    @Test
  public void search() {
        boolean isSearchPresent = new SearchScreen(driver)
                .fillInText("dog")
                .closeBoard()
                .isSearchPresent();
        Assert.assertTrue(isSearchPresent);


    }





}







