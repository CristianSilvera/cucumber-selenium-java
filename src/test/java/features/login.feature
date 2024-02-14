Feature: User login to Book Cart Application

  Scenario: Successful login with valid credentials

    Given the user navigates to the Book Cart application
    When the user clicks on the login button
    And User enter the username as ortoni
    And the user enters the password as Pass1234
    And the user clicks on the login button
    Then the login should be successful


#  Scenario: Successful login with invalid credentials
#
#    Given the user navigates to the Book Cart application
#    When the user clicks on the login button
#    And the user enters the password as Pass1243
#    And the user clicks on the login button
#    Then the login should fail