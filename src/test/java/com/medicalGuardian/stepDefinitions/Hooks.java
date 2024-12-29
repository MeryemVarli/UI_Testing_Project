package com.medicalGuardian.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class Hooks {


    public WebDriver driver;


    @Before
    public void startUo(){

        driver= DriverHelper.getDriver();

    }



    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }






















}
