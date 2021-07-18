package com.udemy.seleniumDesign.singleResponsibilityPrinciple.common;

import com.udemy.seleniumDesign.singleResponsibilityPrinciple.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchSuggestion extends AbstractComponent {

    @FindBy(css = "li.sbct")
    private List<WebElement> suggestions;

    public SearchSuggestion(final WebDriver driver) {
        super(driver);
    }

    public void clickSuggestion(int index) {
        this.suggestions.get(index - 1).click();
    }

 /*   public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.visibilityOf(suggestions.get(1)));
        return this.suggestions.get(5).isDisplayed();
    }*/
 @Override
 public boolean isDisplayed() {
     return this.wait.until((d) -> this.suggestions.size() > 5);
 }

}
