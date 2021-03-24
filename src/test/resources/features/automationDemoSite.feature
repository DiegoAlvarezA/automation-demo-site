@stories
Feature: Sign-up feature
  As An anonymous user
  I Want to be member of the application
  So That I can register with sign-up form

  @scenario1
  Scenario Outline: Successful Sign-up
    Given that I want to sign up in Automation Demo Site
    When I enter in form details
      | firstName | lastName | address | email | phone | gender | hobby | language | skill | country | selectCountry | birthYear | birthMonth | birthDay | password |
      |<firstName>|<lastName>|<address>|<email>|<phone>|<gender>|<hobby>|<language>|<skill>|<country>|<selectCountry>|<birthYear>|<birthMonth>|<birthDay>|<password>|
    Then I see the WebTable tab
    Examples:
      | firstName | lastName | address   | email                | phone      | gender | hobby  | language| skill       | country | selectCountry |birthYear | birthMonth | birthDay | password  |
      | Diego     | Alvarez  | Calle 123 | kble3001@hotmail.com | 3541298566 | Male   | Movies | English | Programming | Colombia| Japan          |1995      | August     | 17       | Test123* |
