package com.udemy.seleniumDesign.singleResponsibilityPrinciple.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.debugger.Page;

public abstract class AbstractComponent {
    protected WebDriverWait wait;

    public AbstractComponent(final WebDriver driver){
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }
    public abstract boolean isDisplayed();
}
