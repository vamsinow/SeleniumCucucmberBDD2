Feature: Perform add to cart operation

  Scenario: User performs add to cart operation with validations
    Given user navigates to the login page of Lenskart
    And user navigates to the Computer Glasses section
    When user performs a random click to select any product
    And user navigated to product
    Then user validate the product by price
    When user clicks on  buynow operation
    Then user validate the product by name
    And user navigates to the Lenskart homepage
