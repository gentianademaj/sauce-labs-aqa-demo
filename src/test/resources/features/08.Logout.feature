Feature: Logout

  Scenario: Successful logout from the page

    Given Matt is a valid user of SauceDemo
    When He navigates to the burger menu
    Then He should be able to logout