Feature: Sample Scenarios for DataTable

  Scenario: Login Scenario by using asList
    Given Open browser and launch adactin url
    When Enter the username as List
      | Azra  |
      | Aishu |
    And Enter the password as List
      | azra123  |
      | aishu123 |

  Scenario: Login Scenario by using asLists
    Given Open browser and launch adactin url
    When Enter the username as Lists
      | Azra  | Guhan   |
      | Aishu | Habeefa |
    And Enter the password as Lists
      | azra123  | guhan123 |
      | aishu123 | habee123 |

  Scenario: Login Scenario by using asMap
    Given Open browser and launch adactin url
    When Enter the username as Map
      | Username | Aishu |
    And Enter the password as Map
      | Password | aishu123 |

  Scenario: Login Scenario by using asMaps
    Given Open browser and launch adactin url
    When Enter the details as Maps
      | Username | Password    | Email                 |
      | Sasi     | sasi123     | sasi123@gmail.com     |
      | Karthika | karthika123 | karthika123@gmail.com |
      | Harish   | harish123   | harish123@gmail.com   |
