package com.udemy.seleniumDesign.singleResponsibilityPrinciple.test.factory;
import com.udemy.seleniumDesign.factory.GoogleFactory;
import com.udemy.seleniumDesign.factory.GooglePage;
import com.udemy.seleniumDesign.singleResponsibilityPrinciple.test.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {
    private GooglePage googlePage;

    @Test(dataProvider = "getData")
    public void searchTest(String langauge, String keyword){
        this.googlePage = GoogleFactory.get(langauge, this.driver);
        this.googlePage.launchSite();
        this.googlePage.search(keyword);
       // int resultCount = this.googlePage.getResultsCount();
      //  System.out.println("Result Count "+ resultCount);
    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"ENG","selenium"},
                {"FR","design pattern"},
                {"SA","docker"}
        };
    }
}
