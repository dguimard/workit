Feature: a user authenticate via rest using parameters

  Background:
    Given New User try to login using :
      | params0 | p0   	|
      | params1 | p2 	|
      | params2 | p3 	|
   

  @BasicFullCycleTest
  Scenario Outline: basic full cycle test

    When A user X authenicate using an INPUT value0 at params (params0: wrongParam, params1: randomInputWillFail)
    
    Then An <response> payload is:
      | attribute0 	| attribute1 | attribute2 |
      |     		| error		  | 7   |
      | 4   		| 1550  |     |
    And Error  events
  

  @FailedLdapAuthorization
  Scenario: cancel ldapAuth

    Given New user Y where LdapParamater  is :
      | params0 | 2 |
      | params0 | 2 |

    When A user X authenicate using an INPUT value0 at params (params0: wrongParam, params1: randomInputWillFail)

    Then A response of a client Y:
      | attribute0 	| attribute1 | attribute2 |
      |     		| error		  | 7   |
      | 4   		| 1550  |     |

  