package com.qaprosoft.carina.demo.ebay;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.ebay.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayWebTests implements IAbstractTest {



    @Test()
    public void testLogin() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        LoginPageEbay loginPageEbay = homePageEbay.getLoginLink().clickOnLoginLink();
        loginPageEbay.authorization();
        Assert.assertEquals(homePageEbay.getHelloText(), "Hi Maria!" , "User not authorised");

    }

    @Test()
    public void testAdvancedSearch(){
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        homePageEbay.clickOnAdvBun();
        AdvSearchPage advSearchPage = new AdvSearchPage(getDriver());
        advSearchPage.typeKeyword("kitchenaid");
        advSearchPage.typePrice("1000");
        advSearchPage.clickSearchBtn();
        ResultsPage resultsPage = new ResultsPage(getDriver());
        Assert.assertEquals(resultsPage.getAllList(), "All Listings", "Results page is not opened!");

    }
    @Test()
    public void testMessages() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        LoginPageEbay loginPageEbay = homePageEbay.getLoginLink().clickOnLoginLink();
        loginPageEbay.authorization();
        homePageEbay.getMyEbayBtn().hover();
        homePageEbay.clickOnMessBtn();
        MessagesPage messagesPage = new MessagesPage(getDriver());
        Assert.assertEquals(messagesPage.getHeaderText(), "My eBay: Messages", "Messages is not opened!");
    }

    @Test()
    public void testChangeLang() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        homePageEbay.getLangBtn().hover();
        homePageEbay.getLangFrBtn().click();
        Assert.assertEquals(homePageEbay.getHiText(), "Bienvenue ! Connectez-vous ou inscrivez-vous", "Language is not changed!");


    }

    @Test()
    public void testAddToBasket() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        LoginPageEbay loginPageEbay = homePageEbay.getLoginLink().clickOnLoginLink();
        loginPageEbay.authorization();
        Assert.assertEquals(homePageEbay.getHelloText(), "Hi Maria!" , "User not authorised");
        pause(3);
        homePageEbay.clickOnDealsLink();
        DailyDealsPage dailyDealsPage = new DailyDealsPage(getDriver());
        Assert.assertEquals(dailyDealsPage.getDealNav(), "Daily Deals", "Page is not opened");
        int randomNum = (int) (Math.random() * dailyDealsPage.getListOfItems().size());
        dailyDealsPage.getListOfItems().get(randomNum).getLinkToItem().click();
        ItemPage itemPage = new ItemPage(getDriver());
        itemPage.getCartBtnClone().click();
        BasketPage basketPage = new BasketPage(getDriver());
        Assert.assertEquals(basketPage.getBasketText(),"Shopping cart (1 item)", "Error");


    }
    @Test
    public void testRemoveFromBasket() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        homePageEbay.clickOnDealsLink();
        DailyDealsPage dailyDealsPage = new DailyDealsPage(getDriver());
        Assert.assertEquals(dailyDealsPage.getDealNav(), "Daily Deals", "Page is not opened");
        int randomNum = (int) (Math.random() * dailyDealsPage.getListOfItems().size());
        dailyDealsPage.getListOfItems().get(randomNum).getLinkToItem().click();
        ItemPage itemPage = new ItemPage(getDriver());
        itemPage.getAddToBasketBtn();
        BasketPage basketPage = new BasketPage(getDriver());
        basketPage.clickRemoveBtn();


    }

    @Test
    public void testSaveForLater() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        homePageEbay.clickOnDealsLink();
        DailyDealsPage dailyDealsPage = new DailyDealsPage(getDriver());
        Assert.assertEquals(dailyDealsPage.getDealNav(), "Daily Deals", "Page is not opened");
        int randomNum = (int) (Math.random() * dailyDealsPage.getListOfItems().size());
        dailyDealsPage.getListOfItems().get(randomNum).getLinkToItem().click();
        ItemPage itemPage = new ItemPage(getDriver());
        itemPage.getAddToBasketBtn();
        BasketPage basketPage = new BasketPage(getDriver());
        basketPage.clickSaveForLaterBtn();

    }

    @Test()
    public void testAddToWatchList() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        LoginPageEbay loginPageEbay = homePageEbay.getLoginLink().clickOnLoginLink();
        loginPageEbay.authorization();
        homePageEbay.clickOnDealsLink();
        DailyDealsPage dailyDealsPage = new DailyDealsPage(getDriver());
        Assert.assertEquals(dailyDealsPage.getDealNav(), "Daily Deals", "Page is not opened");
        int randomNum = (int) (Math.random() * dailyDealsPage.getListOfItems().size());
        dailyDealsPage.getListOfItems().get(randomNum).getLinkToItem().click();
        ItemPage itemPage = new ItemPage(getDriver());
        itemPage.getAddToWatchList();



    }

    @Test
    public void testLogOut() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        LoginPageEbay loginPageEbay = homePageEbay.getLoginLink().clickOnLoginLink();
        loginPageEbay.authorization();

        Assert.assertEquals(homePageEbay.getHiText(), "Hi Maria!", "Error");
        homePageEbay.getLoginBtn().hover();
        homePageEbay.getLogOutBtn().click();
        Assert.assertEquals(homePageEbay.getHelloText(), "Hi Maria (Sign in)" , "User not logged in");


    }







}