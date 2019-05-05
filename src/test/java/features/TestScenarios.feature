Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page and enters username and password
    Then success message is displayed "Signed in successfully."
