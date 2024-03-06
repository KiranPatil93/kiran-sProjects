Feature: Fulfillment Officer Task
  Background:
    Given User is logged in on Zoo Animal Management application as Fulfillment officer
    And User is on Fulfillment Officer Tasks page

    Scenario: Medical team may only see medical requests
      Given List of requests are displayed on Fulfillment Officer Tasks page
      When User click on Task name
      And navigate on Fulfillment officer request detail page
      And check the Request Type is Medical
      Then Fulfillment officer shows the medical Request

  Scenario: Equipment team may only see Equipment requests
    Given List of requests are displayed on Fulfillment Officer Tasks page
    When User click on Task name
    And navigate on Fulfillment officer request detail page
    And check the Request Type is Equipment
    Then Fulfillment officer shows the Equipment Request

Scenario: User Rejecting a request with necessary comments
  Given List of requests are displayed on Fulfillment Officer Tasks page
  When user click on Task name
  And navigate on Fulfillment officer Approval request  page
  And click on 'Accept' button then Request is editable
  And Click on 'Reject' Button
  And click on Reject button displyed on confirmation window
  Then Request again send back to requester and displayed on Fulfillment officer task page

  Scenario: User cancelled to reject the request
    Given List of requests are displayed on Fulfillment Officer Tasks page
    When user click on Task name
    And navigate on Fulfillment officer Approval request  page
    And click on 'Accept' button then Request is editable
    And Click on 'Reject' Button
  And click on Cancle button displyed on confirmation window

Scenario:Accepting a request with optional comments with Estimated cost less than $500
  Given List of requests are displayed on Fulfillment Officer Tasks page
  When user click on Task name
  And navigate on Fulfillment officer Approval request  page
  And User is clicked on Accept button
  And User can Add Estimated cost less than $500
  And click on Submit button
  And comment is optional
  And click on Submit button
  Then Request is removed from fulfillment officer task page


  Scenario:Rejected requests must be completed within 48 hours, otherwise they will be automatically cancelled
    Given List of requests are displayed on Fulfillment Officer Tasks page
    When user click on Task name
    And navigate on Fulfillment officer Approval request  page
    And click on 'Accept' button then Request is editable
    And Click on 'Reject' Button
    And Request is pending for more than 48 hours
    Then Request is Automatically cancelled and not shown on Request detail page

  Scenario:Accepting a request with optional comments Estimated cost more than $500
    Given List of requests are displayed on Fulfillment Officer Tasks page
    When user click on Task name
    And navigate on Fulfillment officer Approval request  page
    And User is clicked on Accept button
    And User can Add Estimated cost more than $500
    And click on Submit button
    And comment is optional
    And click on Submit button
    Then Request remove from fulfillment officer task page and displyed on 'Director Approval Task'page

    Scenario: Fulfillment ensures that each accepted request will be prompted to go in and complete request.
      Given List of requests are displayed on Fulfillment Officer Tasks page
      When user click on Task name
      And navigate on Fulfillment officer Approval request  page
      And User is clicked on Accept button
      And User can Add Estimated cost less than $500
      And click on Submit button
      And comment is optional
      And click on Submit button
      Then Request remove from fulfillment officer task page

      Scenario: Fulfillment ensures that Fulfillment provides the actual cost and date of completion
        Given List of requests are displayed on Fulfillment Officer Tasks page
        When user click on Task name
        Then navigate on Fulfillment officer Approval request  page
        And Start date is present on start date field
        And End date is present on End Date filed
        And Actual cost is present on page


        Scenario: Fulfillment ensures thatFulfillment may provide any final comments.
          Given List of requests are displayed on Fulfillment Officer Tasks page
          When user click on Task name
          And navigate on Fulfillment officer Approval request  page
          And User is clicked on Accept button
          And User can Add Estimated cost less than $500
          And click on Submit button
          And Enter Comment
          And click on Submit button
          Then Request remove from fulfillment officer task page

  Scenario: Submit button must be disable when user will not  click on Accept button
    Given USer clicked on task name which is present on Fulfillment Officer Tasks page
    And user is on Fulfillment officer Approval request  page
    When user click on Submit button
    Then Submit button is disabled

  Scenario: Submit button must be enable when user is  clicked on Accept button
    Given USer clicked on task name which is present on Fulfillment Officer Tasks page
    And user is on Fulfillment officer Approval request  page
    When user click on Accept button
    And user click on Submit button
    Then Approval button is enabled

  Scenario: User navigate on Fulfillment Officer Tasks page when click on Go Back button
    Given USer clicked on task name which is present on Fulfillment Officer Tasks page
    And user is on Fulfillment officer Approval request  page
    When User click on Go Back button
    Then Navigate on Fulfillment Officer Tasks page

  Scenario: User can Reassign task
    Given USer clicked on task name which is present on Fulfillment Officer Tasks page
    And user is on Fulfillment officer Approval request  page
    When user click on Reassign button
    Then New Reassign Task popup window has been open
    When Choose correct option from Reassign To radio buttons
    And select name of assignee
    And click on Reassign button
    Then user navigate on Fulfillment Officer Tasks page

  Scenario:  user can see Accept message at the top of page
    Given USer clicked on task name which is present on Fulfillment Officer Tasks page
    And user is on Fulfillment officer Approval request  page
    Then user can see message 'You must accept this task before completing it' at the top of page

