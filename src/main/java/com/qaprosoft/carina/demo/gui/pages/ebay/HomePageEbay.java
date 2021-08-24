package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.WeValuePrivacyAd;
import com.qaprosoft.carina.demo.gui.components.ebay.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePageEbay extends AbstractPage {

    @FindBy(xpath = "//ul[@id= 'gh-t']")
    private LoginButton loginLink;

    @FindBy(xpath = "//span[@class='gh-ug-guest']")
    private ExtendedWebElement loginBtn;

    @FindBy(xpath = "//button[@class= 'gh-ua gh-control']")
    private ExtendedWebElement hiText;

    @FindBy(xpath = "//span[@id='gh-ug']")
    private ExtendedWebElement helloText;

    @FindBy(xpath = "//a[@class= 'gh-p']")
    private DealsItem openDeals;

    @FindBy(xpath = "//a[contains(text(), 'Sign out')]")
    private ExtendedWebElement logOutBtn;

    @FindBy(xpath = "//a[@class= 'gh-p']")
    private ExtendedWebElement dealsLink;

    @FindBy(xpath = "//a[@id= 'gh-as-a']")
    private ExtendedWebElement advBtn;

    @FindBy(xpath = "//a[@href= 'https://www.ebay.com/mys/home?source=GBH']")
    private ExtendedWebElement myEbayBtn;

    @FindBy(xpath = "//a[@href= 'https://mesg.ebay.com/mesgweb/ViewMessages/0']")
    private ExtendedWebElement messBtn;

    @FindBy(xpath = "//div[@class= 'gf-flags-wpr']")
    private ExtendedWebElement langBtn;

    @FindBy(xpath = "//a[@href= 'https://www.ebay.fr']")
    private ExtendedWebElement langFrBtn;


    public HomePageEbay(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }
    public LoginButton getLoginLink() {
        return loginLink;

    }
    public void loginBtn() {
        this.loginBtn.click();
    }
    public String getText() {
        return helloText.getText();
    }
    public DealsItem getOpenDeals() {
        return openDeals;
    }
    public void logOutBtn() {
        this.logOutBtn.click();

    }

    public void clickOnDealsLink() {
        dealsLink.click();
    }

    public void clickOnAdvBun() {
        advBtn.click();
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

    public String getHiText() {
        return hiText.getText();
    }



}
