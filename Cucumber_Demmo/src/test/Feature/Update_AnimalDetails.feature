Feature: Update Animals Details

  Background:
    Given User is on Animal Details page
    And Record of particular animal is displayed
    When User is click on animal name
    Then navigate on Animal summary page

Scenario:Employees can edit name of Animal
    Given User click on 'Update Animal Details' button present on Summary page
    And navigate on animal details window
    When User changed name of Animal
    And click on 'Submit' button
    Then name of Animal is updated on animal Summary page

  Scenario:Employees can edit 'Gender' of Animal
    Given User click on 'Update Animal Details' button present on Summary page
    And navigate on animal details window
    When User  changed the  Gender of Animal
    And click on 'Submit' button
    Then Gender of Animal is updated on animal Summary page

  Scenario:Employees can edit 'Species Type' of Animal
    Given User click on 'Update Animal Details' button present on Summary page
    And navigate on animal details window
    When User  changed the  Species Type of Animal
    And click on 'Submit' button
    Then Species Type of Animal is updated on animal Summary page

  Scenario:Employees can edit 'Age' of Animal
    Given User click on 'Update Animal Details' button present on Summary page
    And navigate on animal details window
    When User  changed the  Age of Animal
    And click on 'Submit' button
    Then Age of Animal is updated on animal Summary page

  Scenario:Employees can edit 'Photo' of Animal
    Given User click on 'Update Animal Details' button present on Summary page
    And navigate on animal details window
    When User  changed the  photo of Animal
    And click on 'Submit' button
    Then Photo of Animal is updated on animal Summary page

Scenario: Employees can re-assign animals to different pens.
  Given User click on 'Update Animal Details' button present on Summary page
  And navigate on animal details window
  When user select pen from 'Pen Name' dropdown
  And click on Submit button
  Then pen is updated on animal summary page

  Scenario: Employees can remove animals and pens from the zoo.

