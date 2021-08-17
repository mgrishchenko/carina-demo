package com.qaprosoft.carina.demo.gui.components.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.ebay.LoginPageEbay;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginButton extends AbstractUIObject {

    @FindBy(xpath = "//a[contains(text(), 'Sign in')]")
    private ExtendedWebElement loginLink;


    public LoginButton(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public LoginPageEbay clickOnLoginLink() {
        loginLink.click(7);
        return new LoginPageEbay(driver);

    }
}
