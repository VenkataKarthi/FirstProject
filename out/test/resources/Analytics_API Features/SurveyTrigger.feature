Feature: Testing the Survey trigger API

  Scenario Outline: Checking Survey API hit
    Given the user is calling the Survey Trigger API
    When the user performs a get request to the Survey Trigger API
    And the user is triggering Survey "<Event>"
    Then the request returns success triggered by Survey "<Event>"

    Examples:
      |Event                    |
      |SURVEY_SCORE_CALCULATION |
      |SURVEY_SCORE_MIGRATION   |


  Scenario Outline: Validation of response
    Given the user is calling the Survey Trigger API
    When the user performs a get request to the Survey Trigger API
    And the user is triggering Survey "<Event>"
    Then the request returns success triggered by Survey "<Event>"
    And the body is validated based on the Survey "<Event>"

    Examples:
      |Event                    |
      |SURVEY_SCORE_CALCULATION |
      |SURVEY_SCORE_MIGRATION   |

  Scenario Outline: Validation of headers
    Given the user is calling the Survey Trigger API
    When the user performs a get request to the Survey Trigger API
    And the user is triggering Survey "<Event>"
    Then the request returns success triggered by Survey "<Event>"
    And header validation is performed based on Survey "<Event>"

    Examples:
      |Event                    |
      |SURVEY_SCORE_CALCULATION |
      |SURVEY_SCORE_MIGRATION   |