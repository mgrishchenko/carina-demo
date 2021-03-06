package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class LoginPageEbay extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//input[@id = 'userid']")
    private ExtendedWebElement EmailField;

    @FindBy(xpath = "//button[@id= 'signin-continue-btn']")
    private ExtendedWebElement ContinueBtn;

    @FindBy(xpath = "//input[@id= 'pass']")
    private ExtendedWebElement PassField;

    @FindBy(xpath = "//button[@id= 'sgnBt']")
    private ExtendedWebElement SignBtn;


    public LoginPageEbay(WebDriver driver) {
        super(driver);
        setPageURL("https://www.ebay.com/");
    }

    public ExtendedWebElement EmailField() {
        return EmailField;
    }
    public ExtendedWebElement ContinueBtn() {
        return ContinueBtn;
    }
    public ExtendedWebElement PassField() {
        return PassField;
    }
    public ExtendedWebElement SignBtn() {
        return SignBtn;
    }

    public void authorization() {
        EmailField.type(R.TESTDATA.get("email"));
        ContinueBtn().click();
        PassField().type(R.TESTDATA.get("password"));
        SignBtn().click();

    }
}
