Feature:Customer summary
  Background :I can create New customer

  @SmokeTest
  Scenario Outline: I can navigate on customer summary page
    When I click on customer name link "<customerName>"
    Then I can navigate on customer page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
    Scenario Outline: I can create a  fund from customer summary page
    Given I click on customer name link "<customerName>"
    When I click on add sub funds button
    And I enter LEI code "<LEICode>"
    And I enter  Fund name "<fundName>"
    And I  select Domicile from Domicile dropdown "<domicile>"
    And I  select currency from Currency dropdown "<currency>"
    And I  select Incorporate date "<date>"
    And I select Finanacial year end Date "<financeEndDate>"
    And I enter other fund Information "<fundInfo>"
    And I click on Next button
    And I click on Next button
    And I click on Next button
    And I click on Next button
    Then I click on submit button

    Examples:
      | customerName            | LEICode              | fundName | domicile | currency | date     | fundInfo | financeEndDate |
      | bamboo capital partners | kkkkkkkkkk1234567890 | test     | Austriya | USD      | 3/5/2023 | testing  | 3/5/2023       |

  @SmokeTest
  Scenario Outline: I can navigate on RDC page
  Given I click on customer name link "<customerName>"
  When I click on Log into RDC button
  Then I navigate on RDC page
  Examples:
    | customerName            |
    | bamboo capital partners |

  @SmokeTest
  Scenario Outline: I can see Basic Info page
    Given I click on customer name link "<customerName>"
    And I can navigate on customer page
    When I click on Basic Info link
    Then I can navigate on Basic Info page

    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
    Scenario Outline: I can Add Previous customer name
      Given I click on customer name link "<customerName>"
      And I can navigate on customer summary page
      And I click on Basic Info link
      And I can navigate on Basic Info page
      When I click on Add previous Name link
      And I can navigate on Add previous Name page
      And I enter previous customer name in Name field "<name>"
      And I select Effective from date "<effectiveFrom>"
      And I select Ceased on date "<ceasedOn>"
      And I click on Add previous customer name button
      Then I can see previous customer name added on Basic Info page "<name>"
    Examples:
      | customerName            | name    | effectiveFrom | ceasedOn   |
      | bamboo capital partners | testing | 3/01/2022     | 25/01/2023 |


  @SmokeTest
Scenario Outline: I can see  Funds summary
  Given I click on customer name link "<customerName>"
  And I can navigate on customer summary page
  And I click on Basic Info link
  And I can navigate on Basic Info page
  When I click on  funds name
    Examples:
      | customerName            |
      | bamboo capital partners |


  @SmokeTest
  Scenario Outline:I can Add Beneficial Owner
  Given I click on customer name link "<customerName>"
  And I  navigate on customer summary page
  And I click on Basic Info link
  And I navigate on Basic Info page
    When I click on Add Beneficial owner link
    And I navigate on Add Beneficial owner page
    And I enter Benificial name "<beneficialName>"
    And I select owner type "<ownerType>"
    And I enter Date of Birth "<birthDate>"
    And I enter percentage of ownership "<ownership>"
    And I enter government Issued Id "<govID>"
    And I enter Country/Jurisdiction "<country>"
    Then I click on Add Benificial Owner button
    Examples:
      | customerName            | beneficialName | birthDate  | ownerType | ownership | govID  | country  |
      | bamboo capital partners | test           | 27/04/1993 | Person    | 20        | 345436 | Austriya |

  @SmokeTest
    Scenario Outline:I can see Documents details
      Given I click on customer name link "<customerName>"
      And I  navigate on customer summary page
      When I click on documents link
      Then I can see Documents page "<documentPage>"
      Examples:
        | customerName            | documentPage     |
        | bamboo capital partners | Search documents |

  @SmokeTest
  Scenario Outline:I can see Products details
    Given I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on Products link
    Then I can see Products page
    Examples:
      | customerName            |
      | bamboo capital partners |


  @SmokeTest
  Scenario Outline:I can see History
    Given I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on History link
    Then I can see History page "<historyPage>"
    Examples:
      | customerName            | historyPage |
      | bamboo capital partners | Modified By |


  @SmokeTest
  Scenario Outline:I can see Risk Assessments
    Given I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on Risk Assessments link
    Then I can see Risk Assessments page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can see Proposals
    Given I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on Proposals link
    Then I can see Proposals page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can see Related Actions
    Given I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on Related Actions link
    Then I can see Related Actions page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Attach page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on attach link
    Then I navigate on Attach page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Edit Details page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Edit Details link
    Then I navigate on Edit Details page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Edit Entity Relationship page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Edit Entity Relationship link
    Then I navigate on Edit Entity Relationship page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Update contacts page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Update contacts link
    Then I navigate on Update contacts page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Edit Delegate Relationships page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Edit Delegate Relationships link
    Then I navigate on Edit Delegate Relationships page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Add Beneficial owner page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add Beneficial owner link
    Then I navigate on Add Beneficial owner page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Add Address page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add Address link
    Then I navigate on Add Address page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Add links page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add links link
    Then I navigate on Add links page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Add Previous Name page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add Previous  link
    Then I navigate on Add Previous  page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Add Risk Assessment page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add Risk Assessment link
    Then I navigate on Add Risk Assessment page
    Examples:
      | customerName            |
      | bamboo capital partners |

  @SmokeTest
  Scenario Outline:I can navigate on Add  Funds page from Related Actions page
    Given  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add  Funds link
    Then I navigate on Add Sub Funds page
    Examples:
      | customerName            |
      | bamboo capital partners |

