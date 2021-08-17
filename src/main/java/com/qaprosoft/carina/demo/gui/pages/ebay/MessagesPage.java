package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class MessagesPage extends AbstractPage {

    @FindBy(xpath ="//ul[@class= 'nav nav-tabs-p']")
    private ExtendedWebElement headerPanel;

    @FindBy(xpath = "//div[@id= 'ebay-f-inbx']")
    private ExtendedWebElement inboxPanel;

    @FindBy(xpath = "//div[id= 'header2-com']")
    private ExtendedWebElement inboxHeader;

    @FindBy(xpath = "//h1[@id= 'mainH1']")
    private ExtendedWebElement headerText;

    public MessagesPage(WebDriver driver) {
        super(driver);
        setPageURL("https://mesg.ebay.com/mesgweb/ViewMessages/0");
    }


    public ExtendedWebElement getHeaderPanel() {
        return headerPanel;
    }
    public ExtendedWebElement getInboxPanel() {
        return inboxPanel;
    }
    public ExtendedWebElement getInboxHeader() {
        return inboxHeader;
    }
    public String getHeaderText() {
        return headerText.getText();
    }



}
