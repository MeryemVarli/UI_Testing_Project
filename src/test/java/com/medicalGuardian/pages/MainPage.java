package com.medicalGuardian.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MainPage {


    private WebDriver driver;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }



    @FindBy(xpath = "//a[.='How It Works']")
    WebElement HowItWorksButton;


    @FindBy(xpath = "//span[contains(text(),'How It Works')]")
    WebElement header;


    @FindBy(css = "a[title='Facebook']")
    WebElement facebookBtn;




    @FindBy(xpath = "//li[@class='main-nav--item main-nav--products']/a[@class='hasDropdown']")
    WebElement productsDropdown;


    @FindBy(xpath = "//a[@data-product='home']")
    WebElement mgHomeCellular;






    public void howItWorksFunctionality(String expectedHeader){
        BrowserUtils.click(this.HowItWorksButton,driver);
        String actualHeader = BrowserUtils.getText(this.header, driver);
        Assert.assertEquals("Failed to validate the header",expectedHeader,actualHeader);
    }



    public void scrollToFacebookIcon(){
        BrowserUtils.scrollWithJS(driver,this.facebookBtn);

    }



    public void clickOnMgHomeOnProducts(){

        BrowserUtils.click(this.productsDropdown,driver);
        BrowserUtils.click(this.mgHomeCellular,driver);
    }






















}
