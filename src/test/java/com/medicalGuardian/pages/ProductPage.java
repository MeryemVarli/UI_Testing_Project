package com.medicalGuardian.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ProductPage {

  private WebDriver driver;



  public ProductPage(WebDriver driver){
    PageFactory.initElements(driver,this);
    this.driver=driver;
  }






  @FindBy(xpath = "//a[@id='btn-cart-options']")
  WebElement selectOptionsBtn;


  @FindBy(xpath = "//div[@class='checkradios-radio kit-member checkradios radio-styled radio-p160-k9-g10 checked checkradios-on icon-checkradios-circle']")
  WebElement whiteColorCheckBox;


  @FindBy(xpath = "//a[@id='btn-add-to-cart']")
  WebElement addToCartBtn;



  public void addToCartFunctionality(){

    BrowserUtils.click(this.selectOptionsBtn,driver);
    BrowserUtils.click(this.whiteColorCheckBox,driver);
    BrowserUtils.click(this.addToCartBtn,driver);
  }
























}
