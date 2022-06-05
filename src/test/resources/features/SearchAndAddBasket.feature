Feature: Searching for a product and add to basket

  Background: skip splash
    When user selects country
    And user clicks close button

  @Android @controlPrice
  Scenario: Search product and add to basket
    When user clicks account tab
    And user enters "xapoyil135@about27.com" email information
    And user enters "123123Tek" password information
    And user clicks submit button
    And user clicks main Screen
    And user click homePage button
    Given user clicks first result on the home page
    When user control product price area
    And user clicks add basket button
    Then user controls if prices equal
