Feature: Wishlist Functionality

  Scenario: Add an item to the wishlist
    Given a logged-in user is on the product page
    When user clicks on KidsGlasses
    When the user adds an item to their wishlist
    When user clicks on wishlist
    Then user validate price of select product

  #Scenario: Remove an item from the wishlist
    #Given a logged-in user has items in their wishlist'
    #When user click on wishlst
    #When the user removes added item from their wishlist
    #Then the item should be removed from the user wishlist
