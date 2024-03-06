Feature: Director Approval Tasks

  Background:
    Given User is logged in on Zoo Animal Management application as Director
    And User is on Director Approval Task page

    Scenario: Request Details table is displyed with necessary details
      Given Request Details Table is displyed
      Then Table with column Task Name, status, start time, Animal or pen name,Request ID, Description and Estimated cost

      Scenario: Director can see Request is over budget or not  (actual cost is greater than estimated cost)
        Given  Request Details Table is displyed
        Then Director see request cost in Estimated cost column

        Scenario: Zoo director can show reports
          Given User is on Director Approval Task page
          Then user able to  see the 'Zoo Report' Menu

  Scenario: Director can see an icon to check Request budget
    Given user able to  see the 'Zoo Report' Menu
    When user click on 'Zoo Report menu'
    Then user navigate on 'Zoo Management Report' page
    And check the graph which shows Request budget

  Scenario: Director can see an icon to check  A request that is delivered/closed later than the date needed.
    Given user able to  see the 'Zoo Report' Menu
    When user click on 'Zoo Report menu'
    Then user navigate on 'Zoo Management Report' page
    And check the graph 'Status Type Information' which shows the percentage of Accepted, Rejected and Approved Requested

    Scenario: Director can see an icon to check  count of closed requests that were over budget
      Given user able to  see the 'Zoo Report' Menu
      When user click on 'Zoo Report menu'
      Then user navigate on 'Zoo Management Report' page
      And check the graph 'Status Type Information' which shows the percentage of Accepted, Rejected and Approved Requested

      Scenario: Director has visibility into all records.
        Given List of task is displyed
        When user click on 'Task Name'
        Then user navigate on 'Director Approval Request' page
        And user can see Table of all records with Requested, FO Approval,DR Approval,completion and FO comment column

Scenario: Approve button must be disable when user will not  click on Accept button
  Given USer clicked on task name which is present on director Approval Task page
  And user is on 'Director Approval Request page'
  When user click on Approval button
  Then button is disable

  Scenario: Reject button must be disable when user will  not  click on Accept button
    Given USer clicked on task name which is present on director Approval Task page
    And user is on 'Director Approval Request page'
    When user click on Reject button
    Then button is disabled

  Scenario: Approve button must be enable when user is  clicked on Accept button
    Given USer clicked on task name which is present on director Approval Task page
    And user is on 'Director Approval Request page'
    When user click on Accept button
    And user click on Approval button
    Then Approval button is enabled

  Scenario: Reject button must be enable when user is  clicked on Accept button
    Given USer clicked on task name which is present on director Approval Task page
    And user is on 'Director Approval Request page'
    When user click on Accept button
    And user click on Reject button
    Then Reject button is clickable

    Scenario: User navigate on Director Approval Task page when click on Go Back button
      Given USer clicked on task name which is present on director Approval Task page
      And user is on 'Director Approval Request page'
      When User click on Go Back button
      Then Navigate on Director Approval Task page

      Scenario: User can Reassign task
        Given USer clicked on task name which is present on director Approval Task page
        And user is on 'Director Approval Request page'
        When user click on Reassign button
        Then New Reassign Task popup window has been open
        When Choose correct option from Reassign To radio buttons
        And select name of assignee
        And click on Reassign button
        Then user navigate on Director Approval Task page

        Scenario:  user can see Accept message at the top of page
          Given USer clicked on task name which is present on director Approval Task page
          And user is on 'Director Approval Request page'
          Then user can see message 'You must accept this task before completing it' at the top of page