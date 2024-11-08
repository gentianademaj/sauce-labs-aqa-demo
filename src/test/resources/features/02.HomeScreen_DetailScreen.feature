Feature: Prices of the product

  Scenario: Verify product price consistency between home screen and details screen
    Given Matt is a valid user of SauceDemo
    When She checks the price of "$9.99" of the product Sauce Labs Bike Light
    And Clicks on the title of the Product
    Then She can verify the price on the details screen matches the price in home screen