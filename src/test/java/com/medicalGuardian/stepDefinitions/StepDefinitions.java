package com.medicalGuardian.stepDefinitions;

import com.medicalGuardian.pages.MainPage;
import com.medicalGuardian.pages.ProductPage;
import com.medicalGuardian.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class StepDefinitions {

  WebDriver driver= DriverHelper.getDriver();


  MainPage mainPage = new MainPage(driver);

  LoginPage loginPage = new LoginPage(driver);

  ProductPage productPage = new ProductPage(driver);



    @Given("user navigates to the main page")
    public void user_navigates_to_the_main_page() {

       driver.get(ConfigReader.readProperty("medicalGuardianURL"));
        System.out.println("Navigated to: " + driver.getCurrentUrl());
    }


    @When("user validates the title of the main page as {string}")
    public void user_validates_the_title_of_the_main_page_as(String expectedTitle) {
       expectedTitle= expectedTitle.replaceAll("\\|","|");
       String actualTitle = driver.getTitle();
       Assert.assertEquals("Failed to valida the title",expectedTitle,actualTitle);
       System.out.println(actualTitle);
    }


    @Then("user clicks on how it works button and validates the how it works header as {string}")
    public void user_clicks_on_how_it_works_button_and_validates_the_how_it_works_header_as(String header) {
      mainPage.howItWorksFunctionality(header);

    }

    @Then("user goes back to the main page and  scrolls down to facebook symbol on the main page")
    public void user_goes_back_to_the_main_page_and_scrolls_down_to_facebook_symbol_on_the_main_page() {

       driver.navigate().back();
       mainPage.scrollToFacebookIcon();

    }





    @Given("user is on customer portal")
    public void user_is_on_customer_portal() {
        driver.get(ConfigReader.readProperty("customerPortal"));
        System.out.println("Navigated to :"+driver.getCurrentUrl());

    }

    @When("user enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        loginPage.enterEmailAndPassword(email, password);

    }

    @Then("user clicks submit button and validate welcome message as {string}")
    public void user_clicks_submit_button_and_validate_welcome_message_as(String expectedMessage) {
      loginPage.clickSubmitAndValidateMessage(expectedMessage);
    }






    @When("user clicks on MGHome cellular from product dropdown")
    public void user_clicks_on_mg_home_cellular_from_product_dropdown() {
        mainPage.clickOnMgHomeOnProducts();

    }

    @Then("user clicks on select options and check the box for white color and clicks add to cart button")
    public void user_clicks_on_select_options_and_check_the_box_for_white_color_and_clicks_add_to_cart_button() {
        productPage.addToCartFunctionality();
    }





















}
