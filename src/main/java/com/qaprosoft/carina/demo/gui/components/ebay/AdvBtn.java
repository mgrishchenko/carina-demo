package com.qaprosoft.carina.demo.gui.components.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AdvBtn extends AbstractUIObject {

    @FindBy(xpath = "//a[@id= 'gh-as-a']")
    private ExtendedWebElement advBtn;

    public AdvBtn(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void getAdvBtn() {
        advBtn.click(5);
    }
}