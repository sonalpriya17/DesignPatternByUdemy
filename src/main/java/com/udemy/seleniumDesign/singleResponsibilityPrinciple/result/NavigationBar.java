package com.udemy.seleniumDesign.singleResponsibilityPrinciple.result;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.seleniumDesign.singleResponsibilityPrinciple.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class NavigationBar extends AbstractComponent {

    @FindBy(id = "hdtb-msb")
    private WebElement bar;

    @FindBy(linkText = "Images")
    private WebElement images;

    @FindBy(linkText = "News")
    private WebElement news;

    public NavigationBar(WebDriver driver){
        super(driver);

    }

    public void goToImages(){
        Uninterruptibles.sleepUninterruptibly(30, TimeUnit.MILLISECONDS);
        this.images.click();
    }

    public void goToNews(){
        this.news.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d)-> this.bar.isDisplayed());
    }
}
