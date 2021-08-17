package com.qaprosoft.carina.demo.gui.components.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MyMessagesBtn extends AbstractUIObject {

    @FindBy(xpath = "//a[@href= 'https://mesg.ebay.com/mesgweb/ViewMessages/0']")
    private ExtendedWebElement messBtn;

    public MyMessagesBtn(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickToMessBtn () {
        messBtn.click();
    }
}
