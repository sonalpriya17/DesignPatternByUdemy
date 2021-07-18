package com.udemy.seleniumDesign.strategy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class CreditCard implements PaymentOption{
    @FindBy(id="cc")
    private WebElement cc;

    @FindBy(id="year")
    private WebElement year;

    @FindBy(id="cvv")
    private WebElement cvv;


    @Override
    public void enterPaymentOption(Map<String, String> paymentDetails) {
        this.cc.sendKeys(paymentDetails.get("cc"));
        this.cc.sendKeys(paymentDetails.get("year"));
        this.cc.sendKeys(paymentDetails.get("cvv"));
    }
}
