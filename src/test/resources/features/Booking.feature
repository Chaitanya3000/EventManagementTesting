Feature: Booking Form Submission

  Scenario: Successful Booking
    Given User is on Booking page
    When User enters booking details "John Doe" and "john@example.com"
    And User submits the booking form
    Then Booking should be successful
