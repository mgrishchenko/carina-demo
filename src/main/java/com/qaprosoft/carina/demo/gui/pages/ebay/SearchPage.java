package com.qaprosoft.carina.demo.gui.pages.ebay;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.ebay.SearchItem;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends AbstractPage {

    @FindBy(xpath = "//div[@class= 's-item__wrapper clearfix']")
    private List<SearchItem> searchResults;


    public SearchPage(WebDriver driver) {
        super(driver);

    }

    public List<SearchItem> getSearchResults () {
        return searchResults;

    }

}
