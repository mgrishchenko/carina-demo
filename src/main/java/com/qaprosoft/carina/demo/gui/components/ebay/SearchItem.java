package com.qaprosoft.carina.demo.gui.components.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchItem extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='s-item__wrapper clearfix']")
    private ExtendedWebElement itemsList;

    @FindBy(xpath = "//div[@clas= 'srp-controls srp-controls--with-list srp-controls--with-checkbox srp-controls--resize']")
    private ExtendedWebElement header;

    @FindBy(xpath = "//div[@lass= 's-item__details clearfix'")
    private ExtendedWebElement priceItems;


    public SearchItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public Double getPriceItems() {
        return Double.parseDouble(priceItems.getText());
    }
    public ExtendedWebElement getItemsList() {
        return itemsList;
    }
    public ExtendedWebElement getHeader() {
        return header;
    }



}
