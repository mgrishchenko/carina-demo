package com.qaprosoft.carina.demo.gui.components.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DealsItem extends AbstractUIObject {

    @FindBy(xpath = "//span[contains(@itemprop, 'name')]")
    private ExtendedWebElement dealName;

    @FindBy(xpath = "//div[@itemscope = 'itemscope']")
    private ExtendedWebElement dealPrice;

    @FindBy (xpath = "//a[@style class= 'btn btn-ter  vi-VR-btnWdth-XL']")
    private ExtendedWebElement dealItem;

    @FindBy(xpath = ".//h3/parent::a")
    private ExtendedWebElement linkToItem;

    @FindBy (xpath = "//a[@_sp= 'p2047675.l1473']")
    private ExtendedWebElement addToBasketBtn;


    public DealsItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getDealName() {
        return dealName;
    }
    public ExtendedWebElement getDealPrice() {
        return dealPrice;
    }
    public ExtendedWebElement getDealItem() {
        return dealItem;
    }

    public ExtendedWebElement getLinkToItem() {
        return linkToItem;
    }
    public ExtendedWebElement getAddToBasketBtn() {
        return addToBasketBtn;
    }

}
