Feature: Chart

  Scenario: From home page add products to the chart
    Given User launched SwagLabs application.
    When User logged in the app using username "standard_user" and password "secret_sauce"
    Then User add product "Sauce Labs Backpack" to chart
    Then User add multiple products
      | Product                           |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    Then User logout from the application
