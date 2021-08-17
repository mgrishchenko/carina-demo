package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.WeValuePrivacyAd;
import com.qaprosoft.carina.demo.gui.components.ebay.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class HomePageEbay extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//ul[@id= 'gh-t']")
    private LoginButton loginLink;

    @FindBy(xpath = "//button[@id= 'gh-ug']")
    private ExtendedWebElement loginBtn;

    @FindBy(xpath = "//span[@class= 'gh-ug-guest']")
    private ExtendedWebElement hiText;

    @FindBy(xpath = "//a[@class= 'gh-p']")
    private DealsItem openDeals;

    @FindBy(xpath = "//span[contains(text(), 'Sign out')]")
    private ExtendedWebElement logOutBtn;

    @FindBy(xpath = "//input[@id= 'gh-ac']")
    private ExtendedWebElement searchField;

    @FindBy(xpath = "//input[@id= 'gh-btn']")
    private ExtendedWebElement searchBtn;

    @FindBy(xpath = "//a[@class= 'gh-p']")
    private ExtendedWebElement dealsLink;

    @FindBy(xpath = "//a[@id= 'gh-as-a']")
    private ExtendedWebElement advBtn;

    @FindBy(xpath = "//li[@id='gh-p-2']")
    private ExtendedWebElement sellBtn;

    @FindBy(xpath = "//a[@href= 'https://www.ebay.com/mys/home?source=GBH']")
    private ExtendedWebElement myEbayBtn;

    @FindBy(xpath = "//a[@href= 'https://mesg.ebay.com/mesgweb/ViewMessages/0']")
    private ExtendedWebElement messBtn;

    @FindBy(xpath = "//div[@class= 'gf-flags-wpr']")
    private ExtendedWebElement langBtn;

    @FindBy(xpath = "//a[@href= 'https://www.ebay.fr']")
    private ExtendedWebElement langFrBtn;

    @FindBy(xpath = "//button[@class= 'gh-ua gh-control']")
    private ExtendedWebElement helloText;


    public HomePageEbay(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }
    public LoginButton getLoginLink() {
        return loginLink;

    }
    public ExtendedWebElement getLoginBtn() {
        return loginBtn;
    }
    public String getHiText() {
        return hiText.getText();
    }
    public DealsItem getOpenDeals() {
        return openDeals;
    }
    public ExtendedWebElement getLogOutBtn() {
        return logOutBtn;
    }
    public ExtendedWebElement getSearchField() {
        return searchField;
    }
    public ExtendedWebElement getSearchBtn() {
        return searchBtn;
    }
    public void typeValue (String searchArg) {
        searchField.click();
        searchField.type(searchArg);
    }
    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public void clickOnDealsLink() {
        dealsLink.click();
    }

    public void clickOnAdvBun() {
        advBtn.click();
    }
    public void clickOnSellBtn() {
        sellBtn.click();
    }
    public ExtendedWebElement getMyEbayBtn() {
        return myEbayBtn;

    }
    public void clickOnMessBtn() {
        messBtn.click();
    }
    public ExtendedWebElement getLangBtn() {
        return langBtn;
    }
    public ExtendedWebElement getLangFrBtn() {
        return langFrBtn;
    }

    public String getHelloText() {
        return helloText.getText();
    }


}
