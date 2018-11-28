Feature: Simple Google Search

  Scenario:Google search

    Given That i have loaded the google home page

    When I search for "Govind" in Google home search

    Then I expect some results to be found in google


  Scenario:GoogleSearch

    Given That i have loaded the google home page

    When I search for "Test" in Google home search

    Then I expect some results to be found in google