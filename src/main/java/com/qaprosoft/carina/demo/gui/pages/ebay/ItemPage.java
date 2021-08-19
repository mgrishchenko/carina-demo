package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends AbstractPage {

    @FindBy (xpath = "//a[@id= 'isCartBtn_btn']")
    private ExtendedWebElement addToBasketBtn;

    @FindBy(xpath = "//span[@class= 'vi-atw-txt']//span[contains(text(), 'Add to Watchlist')]")
    private ExtendedWebElement addToWatchList;


    public ItemPage(WebDriver driver) {
        super(driver);
    }


    public ItemPage getAddToBasketBtn() {
        addToBasketBtn.click(3);
        return new ItemPage(driver);
    }
    public ExtendedWebElement getCartBtnClone() {
        return addToBasketBtn;
    }
    public void getAddToWatchList() {
        addToWatchList.click(3);
    }


    }


