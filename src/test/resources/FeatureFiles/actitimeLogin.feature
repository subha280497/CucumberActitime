Feature: 
  Enable user to log in to the application

  Scenario: 
    User should be able to log in

    Given user opened the browser and entered the url
    When user enters username and password
    And hits enter button
    Then project page should be displayed
