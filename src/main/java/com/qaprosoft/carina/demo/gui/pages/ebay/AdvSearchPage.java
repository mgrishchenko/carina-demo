package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AdvSearchPage extends AbstractPage {

    @FindBy(xpath = "//td[@id='gh-title']")
    private ExtendedWebElement advHeader;

    @FindBy(xpath = "//fieldset[@class= 'checkbox-set']")
    private ExtendedWebElement findItems;

    @FindBy(xpath = "//button[@type= 'submit']")
    private ExtendedWebElement searchBtn;

    @FindBy(xpath = "//div[@class= 'result-menus-section']")
    private ExtendedWebElement resultMenu;

    @FindBy(xpath = "//input[@id= '_nkw']")
    private ExtendedWebElement keywordField;

    @FindBy(xpath = "//input[@name= '_udlo']")
    private ExtendedWebElement typePrice;

    @FindBy(xpath = "//td[@id= 'gh-title']")
    private ExtendedWebElement headerText;

    public AdvSearchPage(WebDriver driver) {
        super(driver);
        setPageURL("https://www.ebay.com/sch/ebayadvsearch");
    }

    public ExtendedWebElement getAdvHeader() {
        getAdvHeader().getText();
        return advHeader;
    }

    public ExtendedWebElement getFindItems() {
        return findItems;
    }

    public ExtendedWebElement getResultMenu() {
        return resultMenu;
    }

    public void typeKeyword(String keywordArg) {
        keywordField.click();
        keywordField.type(keywordArg);
        ;
    }

    public void typePrice(String priceArg) {
        typePrice.click();
        typePrice.type(priceArg);
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public String getHeaderText() {
        return headerText.getText();
    }



}

