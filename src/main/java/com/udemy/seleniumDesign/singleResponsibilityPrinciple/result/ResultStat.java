package com.udemy.seleniumDesign.singleResponsibilityPrinciple.result;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.seleniumDesign.singleResponsibilityPrinciple.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ResultStat extends AbstractComponent {

    @FindBy(id = "result-stats")
    private WebElement resultStats;

    public ResultStat(WebDriver driver) {
        super(driver);
    }

   public String getStats(){
       Uninterruptibles.sleepUninterruptibly(20, TimeUnit.MILLISECONDS);
        return this.resultStats.getText();
   }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d)->this.resultStats.isDisplayed());
    }
}
