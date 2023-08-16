Feature: 	Opening different browsers

  
  Scenario: Opening chrome browser
    Given Provide browser details for opening chrome browser
    When Open chrome browser
    Then Validate weather browser is opened properly

  Scenario: Opening bing browser
    Given Provide browser details for opening chrome browser
    When Open bing browser
    Then Validate weather bing browser is opened properly
