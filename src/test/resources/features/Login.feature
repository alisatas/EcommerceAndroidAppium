Feature: happy and sad

  @Android  @login
  Scenario: Android successful login
    When user selects country
    And user clicks close button
    When user clicks account tab
    And user enters "xapoyil135@about27.com" email information
    And user enters "123123Tek" password information
    And user clicks submit button
    Then user controls "xapoyil135@about27.com" username area information

  @BrowserStack @InvalidLogin
  Scenario Outline: Android invalid login
    When user selects country
    Given user selects gender as woman
    When user clicks account tab
    And user enters <email> email information
    And user enters <password> password information
    And user clicks submit button
    Then user control warning message "E-posta adresiniz ve/veya şifreniz hatalı."
    Examples:
      | email | password|
      |"tasalisaa@hotmail.com"|"randomPassword"|
      |"testmail@gmail.com"|"123123Tek"|





