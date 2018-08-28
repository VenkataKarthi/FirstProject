Feature: Testing the referral module of recruitment API

  Scenario Outline: Login to peopleHum as a user
    Given the user navigates to peoplehum with a referral account
    When the user enters an individual account's "<username>" and "<pword>"
    Then the user will be able to access the referral Applications
    And the user can upload a resume for referral
    Examples:
      | username              | pword    |
      | nitinjohn97@gmail.com | Test@123 |