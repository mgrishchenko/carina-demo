package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.ebay.DealsItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DailyDealsPage extends AbstractPage {

    @FindBy(xpath = "//a[contains(text(), 'Deal')]")
    private ExtendedWebElement dealNav;

    @FindBy(xpath = "//nav[@role= 'tablist']")
    private ExtendedWebElement tabList;

    @FindBy(xpath = "//div[@itemscope= 'itemscope']")
    private ExtendedWebElement openItem;

    @FindBy(xpath = "//div[@class = 'col']")
    private List<DealsItem> listOfItems;


    public DailyDealsPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnItem () {
        openItem.click();

    }
    public String getDealNav() {
        return dealNav.getText();
    }
    public List<DealsItem> getListOfItems() {
        return listOfItems;
    }






    }


