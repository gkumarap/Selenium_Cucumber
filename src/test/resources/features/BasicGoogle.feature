Feature: Basicload

  Scenario:loadGoogle
    Given when Webdriver loads
    When Browser loads "https://google.com"
    Then just exit the page
