Feature: Testing the Assessment API

  Scenario Outline: Validating the response of Assessment API hit
    Given the user navigates to Assessment API
    When the body of the Assessment API is updated with "<event>"
    Then the Assessment API returns success when hit with "<event>"
    And the body response is validated corresponding to "<event>"
    Examples:
      |event                         |
      |USER_SCORE_CALCULATION        |
      |USER_SCORE_MIGRATION          |
      |INSTANCE_RANK_CALCULATION     |
      |INSTANCE_RANK_MIGRATION       |
      |INSTANCE_COMPLETE_NOTIFICATION|
      | TEAM_SCORE_CALCULATION       |


  Scenario Outline: Validation of Credentials for Instance Test data
    Given the user navigates to Assessment API
    When the body of the Assessment API is updated with "<event>" and mandatory credentials
    Then the Assessment API returns success when hit with "<event>"
    And the body response is validated corresponding to "<event>"
    Examples:
      |event                         |
      |INSTANCE_RANK_CALCULATION     |
      |INSTANCE_RANK_MIGRATION       |
      |INSTANCE_COMPLETE_NOTIFICATION|
      | TEAM_SCORE_CALCULATION       |

  Scenario Outline: Validation of Credentials for User Test data
    Given the user navigates to Assessment API
    When the body of the Assessment API is updated with "<event>" and mandatory credentials with UserId
    Then the Assessment API returns success when hit with "<event>"
    And the body response is validated corresponding to "<event>"
    Examples:
      |event                         |
      |USER_SCORE_CALCULATION        |
      |USER_SCORE_MIGRATION          |