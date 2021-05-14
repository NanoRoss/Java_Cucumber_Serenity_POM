@Feature
  Feature: test feature to test navigation in site

    @smoke1
    Scenario: Successfully login into app
      Given User navigates to launch page
      When User enters username "standard_user" and password "secret_sauce"
      Then User validates correct login

    @smoke2
    Scenario: wrong password login
      Given User navigates to launch page
      When User enters username "standard_user" and password "asd123"
      Then User validates error message "Epic sadface: Username and password do not match any user in this service"


