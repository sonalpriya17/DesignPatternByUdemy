package com.udemy.seleniumDesign.strategy;

import java.util.Map;

public interface PaymentOption {
    void enterPaymentOption(Map<String, String> paymentDetails);
}
