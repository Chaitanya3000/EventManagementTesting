Feature: Contact Us Form Submission

  Scenario: Valid Contact Us Form Submission
    Given User is on Contact Us page
    When User enters contact form details "Alice", "alice@example.com", "Help Needed", and "Please call me back"
    And User submits the contact form
    Then A confirmation message should be displayed
