Feature: ContactBean feature

  Scenario: create contact
    Given I logged into suiteCRM
    When I save a new contact:
      | firstName | lastName | officePhone | cellphone  | email                   |
      | Steve     | Gates    | 3456758888  | 1234329999 | SteveGates123@gmail.com |
    Then I should see contact information for "Steve Gates"
