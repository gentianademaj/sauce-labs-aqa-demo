Feature: Login to SauceDemo

    Scenario Outline: Successful login with valid credentials
        Given Maria is on the SauceDemo login page
        When The user enters "<username>" and "<password>"
        Then The user should be logged in successfully
        Examples:
            | username       | password     |
            | standard_user  | secret_sauce |
            | problem_user   | secret_sauce |

    Scenario: Login attempt with invalid credentials
        Given Maria is on the SauceDemo login page
        When She enters invalid credentials
        Then She should see an error message






