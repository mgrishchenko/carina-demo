package com.qaprosoft.carina.demo.ebay;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.ebay.HomePageEbay;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChangeLangTest implements IAbstractTest {

    @BeforeSuite()
    public void testChangeLang() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        homePageEbay.getLangBtn().hover();
        homePageEbay.getLangFrBtn().click();
        Assert.assertEquals(homePageEbay.getHiText(), "Bienvenue ! Connectez-vous ou inscrivez-vous", "Language is not changed!");

    }
}
