Feature: Testing the recruitment module of recruitment API

  Scenario Outline: Login to peopleHum as a valid recruiter
    Given the user navigates to peoplehum
    When the user enters valid "<username>" and "<pword>"
    And the user is a valid recruiter
    Then the user will be able to access the Recruiter Applications

    Examples:
      | username              | pword    |
      | nitinjohn97@gmail.com | Test@123 |

  Scenario Outline: Uploading a resume as a recruiter
    Given the user navigates to peoplehum
    When the user enters valid "<username>" and "<pword>"
    And the user is a valid recruiter
    Then the user must be able to upload a resume


    Examples:
      | username              | pword    |
      | nitinjohn97@gmail.com | Test@123 |