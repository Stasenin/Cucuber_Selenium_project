Feature: Test EX login scenario

    Scenario: Test login with valid credentials
      Given Open Firefox and start application
      When Opened web page of rozetka
      And Entered following for credentials
        |username|password|
        |someLogin|somePass|
      Then User successfully login
