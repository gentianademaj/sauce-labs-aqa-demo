Feature: Validate multiple products on cart.

  Scenario: The user is able to add multiple products on the cart

    Given Mia is a SauceDemo user
    When She adds three new products
    And Clicks on the cart
    Then She sees all three products in the cart page
    And She clears products from her Cart