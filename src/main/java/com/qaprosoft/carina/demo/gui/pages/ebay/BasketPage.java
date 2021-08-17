package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.ebay.BasketItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasketPage extends AbstractPage {

    @FindBy(xpath = "//h1[@class= 'main-title']")
    private ExtendedWebElement basketText;

    @FindBy(xpath = "//button[@class= 'call-to-action btn btn--large btn--primary']")
    private ExtendedWebElement callToActionBtn;

    @FindBy(xpath = "//button[@class='faux-link']//span[contains(text(), 'Remove')]")
    private ExtendedWebElement removeBtn;

    @FindBy(xpath = "//button[@class='faux-link']//span[contains(text(), 'Save for later')]")
    private ExtendedWebElement saveForLaterBtn;




    public BasketPage(WebDriver driver) {
        super(driver);
        setPageURL("https://cart.payments.ebay.com/");
    }

    public String getBasketText() {
        return basketText.getText();

    }
    public void clickCallToActionBtn() {
        callToActionBtn.click();
    }
    public void clickRemoveBtn() {
        removeBtn.click();
    }
    public void clickSaveForLaterBtn() {
        saveForLaterBtn.click();
    }
}

