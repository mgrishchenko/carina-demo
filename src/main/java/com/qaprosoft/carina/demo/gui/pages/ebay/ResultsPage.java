package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends AbstractPage {

    @FindBy(xpath = "//span[@class= 'small sel tgl_button first_b']")
    private ExtendedWebElement allList;


    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getAllList() {
        return allList.getText();
    }
}
