Feature: As a M&S customer
        I want to log on my account
        So I can do my shopping

  Background:
    Given user on the login page

    @smoke
  Scenario Outline: Longin to M&S to shop
    When user click on sing in
    Then user should be on sign in page
    When user input email addreess as '<email>' and password as '<password>'
    And click on sign in
    Then user should be log in successfully
    And see the welcoming '<message>'

    Examples:
    |email                      | password   | message|
    |autotesting2019@gmail.com  |Testing2019 |Automation!|
    |kamolsavar@yahoo.co.uk     |Scholar20?  |Kamol!|