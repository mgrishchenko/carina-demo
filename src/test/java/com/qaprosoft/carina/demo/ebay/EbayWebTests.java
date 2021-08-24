package com.qaprosoft.carina.demo.ebay;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.ebay.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayWebTests implements IAbstractTest {



    @BeforeClass
    public void testLogin() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        LoginPageEbay loginPageEbay = homePageEbay.getLoginLink().clickOnLoginLink();
        loginPageEbay.authorization();
        Assert.assertEquals(homePageEbay.getHiText(), "Hi Maria!" , "User not authorised");



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
        homePageEbay.getMyEbayBtn().hover();
        homePageEbay.clickOnMessBtn();
        MessagesPage messagesPage = new MessagesPage(getDriver());
        Assert.assertEquals(messagesPage.getHeaderText(), "My eBay: Messages", "Messages is not opened!");


    }

    @Test()
    public void testAddToBasket() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
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
        BasketPage basketPage1 = new BasketPage(getDriver());
        Assert.assertEquals(basketPage1.getCartText(), "You don't have any items in your cart. Let's get shopping!", "Item is not removed");


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
        pause(3);
        BasketPage basketPage2 = new BasketPage(getDriver());
        Assert.assertEquals(basketPage2.getCartText(), "You don't have any items in your cart. Let's get shopping!", "Item is not removed");


    }

    @Test()
    public void testAddToWatchList() {
        HomePageEbay homePageEbay = new HomePageEbay(getDriver());
        homePageEbay.open();
        Assert.assertTrue(homePageEbay.isPageOpened(), "Home page is not opened");
        homePageEbay.clickOnDealsLink();
        DailyDealsPage dailyDealsPage = new DailyDealsPage(getDriver());
        Assert.assertEquals(dailyDealsPage.getDealNav(), "Daily Deals", "Page is not opened");
        int randomNum = (int) (Math.random() * dailyDealsPage.getListOfItems().size());
        dailyDealsPage.getListOfItems().get(randomNum).getLinkToItem().click();
        ItemPage itemPage = new ItemPage(getDriver());
        itemPage.getAddToWatchList();


    }







}