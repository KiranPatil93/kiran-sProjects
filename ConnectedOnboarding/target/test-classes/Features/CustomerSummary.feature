Feature:Customer summary
  Background: Login successfully
    Given I am on the login screen
    And I enter Username
    And I enter the correct password
    When I press Log in
    Then I should see the HomePage

  @SmokeTest
  Scenario Outline: I can navigate on customer summary page
    Given I click on Customer Menu
    When I click on customer name link "<customerName>"
    Then I can navigate on customer page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

    @SmokeTest
    Scenario Outline: I can navigate on create Funds page
      Given I click on Customer Menu
      And I click on customer name link "<customerName>"
      When I click on add funds button
      Then I navigate on Create Funds page
      Examples:
        | customerName            |
        | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline: I can navigate on RDC page
    Given I click on Customer Menu
  And I click on customer name link "<customerName>"
  When I click on Log into RDC button
  Then I navigate on RDC page
  Examples:
    | customerName            |
    | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline: I can see Basic Info page
    Given I click on Customer Menu
    And I click on customer name link "<customerName>"
    And I can navigate on customer page
    When I click on Basic Info link
    Then I can navigate on Basic Info page

    Examples:
      | customerName            |
      | Astarte Capital Partners |



  @SmokeTest
Scenario Outline: I can see  Funds summary
    Given I click on Customer Menu
  And I click on customer name link "<customerName>"
  And I can navigate on customer summary page
  And I click on Basic Info link
  And I can navigate on Basic Info page
  When I click on funds name
    Examples:
      | customerName            |
      | Astarte Capital Partners |



  @SmokeTest
    Scenario Outline:I can see Documents details
    Given I click on Customer Menu
      And I click on customer name link "<customerName>"
      And I  navigate on customer summary page
      When I click on documents link
      Then I can see Documents page
      Examples:
        | customerName            |
        | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can see Products details
    Given I click on Customer Menu
    And I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on Products link
    Then I can see Products page
    Examples:
      | customerName             |
      | Astarte Capital Partners |


  @SmokeTest
  Scenario Outline:I can see History
    Given I click on Customer Menu
    And I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on History link
    Then I can see History page "<historyPage>"
    Examples:
      | customerName            | historyPage |
      | Astarte Capital Partners | Modified By |


  @SmokeTest
  Scenario Outline:I can see Risk Assessments
    Given I click on Customer Menu
    And I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on Risk Assessments link
    Then I can see Risk Assessments page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can see Proposals
    Given I click on Customer Menu
    And I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on Proposals link
    Then I can see Proposals page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can see Related Actions
    Given I click on Customer Menu
    And I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    When I click on Related Actions link
    Then I can see Related Actions page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can navigate on Attach page from Related Actions page
    Given I click on Customer Menu
    And  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on attach link
    Then I navigate on Attach page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can navigate on Edit Details page from Related Actions page
    Given I click on Customer Menu
    And  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Edit Details link
    Then I navigate on Edit Details page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can navigate on Edit Entity Relationship page from Related Actions page
    Given I click on Customer Menu
    And  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Edit Entity Relationship link
    Then I navigate on Edit Entity Relationship page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can navigate on Update contacts page from Related Actions page
    Given I click on Customer Menu
    And  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Update contacts link
    Then I navigate on Update contacts page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can navigate on Edit Delegate Relationships page from Related Actions page
    Given I click on Customer Menu
    And  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Edit Delegate Relationships link
    Then I navigate on Edit Delegate Relationships page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can navigate on Add Beneficial owner page from Related Actions page
    Given I click on Customer Menu
    And  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add Beneficial owner link
    Then I navigate on Add Beneficial owner page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can navigate on Add Address page from Related Actions page
    Given I click on Customer Menu
    And  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add Address link
    Then I navigate on Add Address page
    Examples:
      | customerName            |
      | Astarte Capital Partners |



  @SmokeTest
  Scenario Outline:I can navigate on Add Risk Assessment page from Related Actions page
    Given I click on Customer Menu
    And  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add Risk Assessment link
    Then I navigate on Add Risk Assessment page
    Examples:
      | customerName            |
      | Astarte Capital Partners |

  @SmokeTest
  Scenario Outline:I can navigate on Add Funds page from Related Actions page
    Given I click on Customer Menu
    And  I click on customer name link "<customerName>"
    And I  navigate on customer summary page
    And I click on Related Actions link
    And I can see Related Actions page
    When I click on Add Funds link
    Then I navigate on Add Funds page
    Examples:
      | customerName            |
      | Astarte Capital Partners |


