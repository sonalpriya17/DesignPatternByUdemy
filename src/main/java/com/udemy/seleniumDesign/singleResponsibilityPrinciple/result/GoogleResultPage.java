package com.udemy.seleniumDesign.singleResponsibilityPrinciple.result;

import com.udemy.seleniumDesign.singleResponsibilityPrinciple.common.SearchSuggestion;
import com.udemy.seleniumDesign.singleResponsibilityPrinciple.common.SearchWidget;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {
    private SearchSuggestion searchSuggestion;
    private SearchWidget searchWidget;
    private NavigationBar navigationBar;
    private ResultStat resultStat;

    public GoogleResultPage(final WebDriver driver){
        this.searchSuggestion = PageFactory.initElements(driver,SearchSuggestion.class);
        this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
        this.navigationBar = PageFactory.initElements(driver, NavigationBar.class);
        this.resultStat = PageFactory.initElements(driver, ResultStat.class);
    }
//page object has no. of objects and this is gonna return those objects

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public ResultStat getResultStat() {
        return resultStat;
    }
}
