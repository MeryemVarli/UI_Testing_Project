package com.medicalGuardian.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserUtils;

import java.time.Duration;

public class LoginPage {


    private WebDriver driver;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }






    @FindBy(css = "#User-name")
    WebElement email;

    @FindBy(xpath = "//input[@id='Pass-word']")
    WebElement password;

    @FindBy(xpath = "//button[.=' Submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//h1[contains(text(),'Hello')] ")   // //h1[.='Hello, Meryem!']
    WebElement message;




  public void enterEmailAndPassword(String email,String password){

      BrowserUtils.sendKeys(this.email,driver,email);
      BrowserUtils.sendKeys(this.password,driver,password);
  }



  public void clickSubmitAndValidateMessage(String expectedMessage){

      BrowserUtils.click(this.submitBtn,driver);
      String actualText = BrowserUtils.getText(this.message,driver);
    Assert.assertEquals("Failed to validate the message",expectedMessage,actualText);

      System.out.println(actualText);

  }


































}
