Feature: medical guardian application

  @TC01
 Scenario Outline: some validations on main page
   Given user navigates to the main page
   When user validates the title of the main page as '<title>'
   Then user clicks on how it works button and validates the how it works header as '<header>'
   And user goes back to the main page and  scrolls down to facebook symbol on the main page
   Examples: test data for main page functionality
   |title                                                          | header |
   |Medical Alert Systems & Monitoring Devices \| Medical Guardian | How It Works|



 @smoke @TC02
 Scenario Outline: positive scenario for login functionality
   Given user is on customer portal
   When user enters email as '<email>' and password as '<password>'
   Then user clicks submit button and validate welcome message as '<expectedMessage>'

   Examples: test data to login
   |email                  |password    |expectedMessage|
   |meryemvarl123@gmail.com| Meryem123@ | Hello, Meryem!|


  @TC03
  Scenario: adding a product in the cart
    Given user navigates to the main page
    When user clicks on MGHome cellular from product dropdown
    Then user clicks on select options and check the box for white color and clicks add to cart button
