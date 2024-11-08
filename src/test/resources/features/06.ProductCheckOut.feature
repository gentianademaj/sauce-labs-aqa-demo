Feature: Check Out a product

  Scenario: Check out a product end to end flow
    Given Mia is a SauceDemo user
    When She adds three new products
    And Clicks on the cart
    Then She sees all three products in the cart page
    And She click on the Checkout button
    And She fills out the Checkout form
    And She clicks on Continue button
    Then She validates the Checkout Overview page
    Then She sees all three products in the cart page
    When She clicks on Finish button
    Then She sees the Thank you for your order page

