@Feature
 Feature: Test Google Search Funcionality.

    @smoke3
    Scenario: As a user i enter a search criteria in Google
      Given Iam on the google search page
      When I enter the search criteria
      And  Click in the search button
      Then The result match the criteria


