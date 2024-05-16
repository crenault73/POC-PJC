Feature: Login

  Scenario Outline: Login to the SwagLabs Application with the correct credentials.
    Given User launched SwagLabs application.
    When User verify the Page title
    When User logged in the app using username "<UserName>" and password "<Password>"
    Then User verify the first product name "<ProductName>"
    Then User logout from the application

    Examples:
      | UserName      | Password     | ProductName         |
      | standard_user | secret_sauce | Sauce Labs Backpack |
      | visual_user   | secret_sauce | Sauce Labs Backpack |
