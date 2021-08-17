package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.ebay.DealsItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ItemPage extends AbstractPage {

    @FindBy (xpath = "//a[@_sp= 'p2047675.l1473']")
    private ExtendedWebElement addToBasketBtn;

    @FindBy(xpath = "//span[@class= 'vi-atw-txt']//span[contains(text(), 'Add to Watchlist')]")
    private ExtendedWebElement addToWatchList;


    public ItemPage(WebDriver driver) {
        super(driver);
    }


    public void getAddToBasketBtn() {
        addToBasketBtn.click(3);
    }
    public void getAddToWatchList() {
        addToWatchList.click(3);
    }


    }


