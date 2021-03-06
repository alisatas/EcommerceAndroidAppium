Feature: Searching for a product and add to basket

  Background: skip splash
    When user selects country
    And user clicks close button

  @Android
  Scenario: Search product and add to basket
    Given user clicks search icon button
    When user writes product name "Jil sander"
    And user clicks first result on words list
    Given user clicks first result among products list
    When user control product price area
    And user clicks add basket button
    Then user controls if prices equal

  @Android
  Scenario:Delete product from basket
    Given user clicks search icon button
    When user writes product name "Jil sander"
    And user clicks first result on words list
    Given user clicks first result among products list
    When user control product price area
    And user clicks add basket button
    Then user controls if prices equal
    Given user control delete button
