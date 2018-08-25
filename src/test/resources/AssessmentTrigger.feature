Feature: Testing the assessment trigger API

  Scenario Outline: Checking Assessment API hit
    Given the user is calling the Assignment Trigger API
    When the user performs a get request to the Assessment Trigger API
    And the user is triggering Assessment "<Event>"
    Then the request returns success triggered by Assessment "<Event>"

    Examples:
      |Event                         |
      |USER_SCORE_CALCULATION        |
      |USER_SCORE_MIGRATION          |
      |INSTANCE_RANK_CALCULATION     |
      |INSTANCE_RANK_MIGRATION       |
      |INSTANCE_COMPLETE_NOTIFICATION|


  Scenario Outline: Validation of response
    Given the user is calling the Assignment Trigger API
    When the user performs a get request to the Assessment Trigger API
    And the user is triggering Assessment "<Event>"
    Then the request returns success triggered by Assessment "<Event>"
    And the body is validated based on the Assessment "<Event>"

    Examples:
      |Event                         |
      |USER_SCORE_CALCULATION        |
      |USER_SCORE_MIGRATION          |
      |INSTANCE_RANK_CALCULATION     |
      |INSTANCE_RANK_MIGRATION       |
      |INSTANCE_COMPLETE_NOTIFICATION|

  Scenario Outline: Validation of headers
    Given the user is calling the Assignment Trigger API
    When the user performs a get request to the Assessment Trigger API
    And the user is triggering Assessment "<Event>"
    Then the request returns success triggered by Assessment "<Event>"
    And header validation is performed based on Assessment "<Event>"

    Examples:
      |Event                         |
      |USER_SCORE_CALCULATION        |
      |USER_SCORE_MIGRATION          |
      |INSTANCE_RANK_CALCULATION     |
      |INSTANCE_RANK_MIGRATION       |
      |INSTANCE_COMPLETE_NOTIFICATION|