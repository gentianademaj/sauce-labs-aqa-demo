Feature: The user is able to sort Z-A, and based on the price

 Scenario: Alex is able to sort Z-A in the dropdown menu

   Given Matt is a valid user of SauceDemo
   When He clicks on the drop down sorting menu
   And He sorts on "za" on Dropdown list
   Then The products are shown accordingly
   And He sorts on "az" on Dropdown list
