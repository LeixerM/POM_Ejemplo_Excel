Feature: Open Browser
 # Scenario: Open Browser
  #  Given the enter user page
   # When the user enters the credentials
    #Then the user look at the home page

 # Scenario Outline: Open Browser
  #  Given the enter user page
   # When the user enters the <email> as email
    #When the user enters the <password> as password
    #Then the <user> look at the home page

   # Examples:
    #  | email          | password | user |
     # | Juan@email.com | 123456   | Juan |
     # | pepe@email.com | 123456   | pepe |

 # Scenario Outline: Open Browser
   #  Given the enter user page
    # When the user enters the email as email
     # And the user enters the password as password
     # Then the <user> look at the home page

    # Examples:
     # | user |
     # | Juan |
     # | pepe |


  Scenario Outline: Open Browser
    Given the enter user page
    When the user enters the email as email with the <row>
    And the user enters the password as password with the <row>
    Then the <user> look at the home page

    Examples:
      | row | user |
      | 1   | Juan |
      | 2   | pepe |