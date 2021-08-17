package com.qaprosoft.carina.demo.gui.components.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import io.cucumber.java.an.E;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BasketItem extends AbstractUIObject {

    @FindBy(xpath = "//button[@class= 'faux-link'] and //span[contains(text(), 'Save for later')]")
    private ExtendedWebElement saveForLaterBtn;

    @FindBy(xpath = "//button[@class= 'faux-link']//span[contains(text(), 'Remove')]")
    private ExtendedWebElement removeBtn;

    public BasketItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getSaveForLaterBtn() {
        return saveForLaterBtn;
    }

    public void clickRemoveBtn() {
        removeBtn.click();
    }
}
