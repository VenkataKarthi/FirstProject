Feature: Testing the Search API

  Scenario Outline: Testing the global search API
    Given the user is hitting global search API
    When the body of the Search API is updated with "<Event>"
    Then the request returns success triggered by "<Event>"
    And the search body response is validated corresponding to "<Event>"

    Examples:
      | Event                    |
      | GLOBAL_SEARCH_USER       |
      | GLOBAL_SEARCH_TEAM       |
      | GLOBAL_SEARCH_APPLICANT  |
      | GLOBAL_SEARCH_SURVEY     |
      | GLOBAL_SEARCH_ASSESSMENT |
      | GLOBAL_SEARCH_JOB        |
      | GLOBAL_SEARCH_GOAL       |
      | GLOBAL_SEARCH_TASK       |
      | GLOBAL_SEARCH_IDEA       |
      | GLOBAL_SEARCH_COMPLAINT  |
      | GLOBAL_SEARCH_QUIZ       |
      | GLOBAL_SEARCH_GAME       |
      | GLOBAL_SEARCH_CHALLENGE  |

  Scenario Outline: Testing the global search API
    Given the user is hitting global search API
    When the body of the Search API is updated with "<Event>"
    And the request body Credentials is validated with "<Event>"
    Then the request returns success triggered by "<Event>"
    And the search body response is validated corresponding to "<Event>"

    Examples:
      | Event                    |
      | GLOBAL_SEARCH_USER       |
      | GLOBAL_SEARCH_TEAM       |
      | GLOBAL_SEARCH_APPLICANT  |
      | GLOBAL_SEARCH_SURVEY     |
      | GLOBAL_SEARCH_ASSESSMENT |
      | GLOBAL_SEARCH_JOB        |
      | GLOBAL_SEARCH_GOAL       |
      | GLOBAL_SEARCH_TASK       |
      | GLOBAL_SEARCH_IDEA       |
      | GLOBAL_SEARCH_COMPLAINT  |
      | GLOBAL_SEARCH_QUIZ       |
      | GLOBAL_SEARCH_GAME       |
      | GLOBAL_SEARCH_CHALLENGE  |