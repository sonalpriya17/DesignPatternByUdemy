package com.udemy.seleniumDesign.singleResponsibilityPrinciple.test.singleResponsibilityPrinciple;

import com.udemy.seleniumDesign.singleResponsibilityPrinciple.main.GoogleMainPage;
import com.udemy.seleniumDesign.singleResponsibilityPrinciple.result.GoogleResultPage;
import com.udemy.seleniumDesign.singleResponsibilityPrinciple.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    private GoogleResultPage googleResultPage;
    private GoogleMainPage googleMainPage;

    @BeforeTest
    public void setUpPages(){
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleResultPage = new GoogleResultPage(driver);
    }

    @Test(dataProvider = "getData")
    public void googleWorkFlow(String keyword, int index){
        googleMainPage.goTO();
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());
        googleMainPage.getSearchWidget().enter(keyword);
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());
        googleMainPage.getSearchSuggestion().clickSuggestion(index);
        Assert.assertTrue(googleResultPage.getNavigationBar().isDisplayed());
        System.out.println(googleResultPage.getResultStat().getStats());
       // googleResultPage.getNavigationBar().goToImages();
        googleResultPage.getNavigationBar().goToNews();

    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
            {"Selenium",3},
            {"Docker",2}
        };
    }
}
