package com.udemy.seleniumDesign.singleResponsibilityPrinciple.test;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUpDriver(){
    System.setProperty("webdriver.chrome.driver","./src/Driver/chromedriver 3");
    this.driver= new ChromeDriver();
    }

    @AfterTest
    public void quitDriver(){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        driver.quit();
    }
}
