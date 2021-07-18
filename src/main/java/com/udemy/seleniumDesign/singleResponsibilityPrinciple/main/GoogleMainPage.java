package com.udemy.seleniumDesign.singleResponsibilityPrinciple.main;

import com.udemy.seleniumDesign.singleResponsibilityPrinciple.common.SearchSuggestion;
import com.udemy.seleniumDesign.singleResponsibilityPrinciple.common.SearchWidget;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {
    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;
    public GoogleMainPage(final WebDriver driver){
        this.driver = driver;
        this.searchSuggestion = PageFactory.initElements(driver,SearchSuggestion.class);
        this.searchWidget = PageFactory.initElements(driver,SearchWidget.class); //using a driver it will create a new instance of SearchWidgit and assign it to tis.searchwidgit
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }
    public void goTO(){
        this.driver.get("https://www.google.com");
    }
// this page object doesnot have any functionality of its own, hence it will return Searchwidgit Functionalityg
    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }
}
