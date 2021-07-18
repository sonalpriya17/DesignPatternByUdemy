package com.udemy.seleniumDesign.strategy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
    @FindBy(id="buy")
    private WebElement buy;

    @FindBy(id="orderNumber")
    private WebElement orderNumber;

    public Order(final WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String placeOrder(){
        this.buy.click();
        return this.orderNumber.getText();
    }
}
