Feature: Testing the Survey API

  Scenario Outline: Validating the response of Survey API hit
    Given the user navigates to Survey API
    When the body of the Survey API is updated with "<event>"
    Then the Survey API returns success when hit with "<event>"
    And the survey body response is validated corresponding to "<event>"
    Examples:
      | event                         |
      | SURVEY_SCORE_CALCULATION      |
      | SURVEY_SCORE_MIGRATION        |
      | SURVEY_TEAM_SCORE_CALCULATION |


  Scenario Outline: Validation of Credentials for Survey Test data
    Given the user navigates to Survey API
    When the body of the Survey API is updated with "<event>"
    And the credentials with "<event>" are verified
    Then the Survey API returns success when hit with "<event>"
    And the survey body response is validated corresponding to "<event>"
    Examples:
      | event                         |
      | SURVEY_SCORE_CALCULATION      |
      | SURVEY_SCORE_MIGRATION        |
      | SURVEY_TEAM_SCORE_CALCULATION |