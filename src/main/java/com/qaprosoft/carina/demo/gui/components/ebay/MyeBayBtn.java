package com.qaprosoft.carina.demo.gui.components.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MyeBayBtn extends AbstractUIObject {

    @FindBy(xpath = "//div[@class= 'gh-menu']//a[@class= 'gh-eb-li-a gh-rvi-menu']//a[@title= 'My eBay']")
    private ExtendedWebElement myEbayBtn;


    public MyeBayBtn(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getMyEbayBtn() {
        return myEbayBtn;

    }
}
