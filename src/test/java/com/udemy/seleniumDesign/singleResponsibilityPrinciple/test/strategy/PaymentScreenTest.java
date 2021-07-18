package com.udemy.seleniumDesign.singleResponsibilityPrinciple.test.strategy;

import com.udemy.seleniumDesign.singleResponsibilityPrinciple.test.BaseTest;
import com.udemy.seleniumDesign.strategy.CreditCard;
import com.udemy.seleniumDesign.strategy.NetBanking;
import com.udemy.seleniumDesign.strategy.PaymentOption;
import com.udemy.seleniumDesign.strategy.PaymentScreen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Maps;

import java.util.Map;

public class PaymentScreenTest extends BaseTest {
    private PaymentScreen paymentScreen;

    @BeforeTest
    public void setPaymentScreen(){
        this.paymentScreen= new PaymentScreen(this.driver);
    }

    @Test(dataProvider = "getData")
    public void paymentTest(Map<String,String> paymentDetails, PaymentOption paymentOption){
        this.paymentScreen.goTo();
        this.paymentScreen.getUserInformation().enterDetails("sonal","priya","sonal@gmail.com");
        this.paymentScreen.setPaymentOption(paymentOption);
        this.paymentScreen.pay(paymentDetails);
    /*    String orderNumber = this.paymentScreen.getOrder().placeOrder();
        System.out.println("OrderNumber : "+ orderNumber);*/

    }
    @DataProvider
    public Object[][] getData(){
        Map<String, String> cc = Maps.newHashMap();
        cc.put("cc","4345543");
        cc.put("year","2021");
        cc.put("cvv","334");

        Map<String,String> nb = Maps.newHashMap();
        nb.put("bank","WELLS FARGO");
        nb.put("account","savings");
        nb.put("pin","4344");


            return new Object[][]{
                    {cc,new CreditCard()},
                    {nb,new NetBanking()}
            };
    }
}
