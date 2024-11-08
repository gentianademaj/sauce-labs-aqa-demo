Feature: Add to cart

  Scenario: User is able to add a product to cart

    Given User is in home page
    When User clicks on Add to cart button
    And Clicks on the cart
    Then Cart page is shown with selected product

