#Autor: Paola Andrea Osma Ramos
@stories
Feature: Utest Registration
  As a user, I want to create an account at Utest to have access to all content
  @scenario1
  Scenario Outline: Create Utest account
    Given than Felipe wants to create an account at Utest
    When he fill out the registration form at Utest
      |firstName   | lastName   | email   | monthOfBirth   | dayOfBirth   | yearOfBirth   | zip   | passWord  | confirmPassword |
      |<firstName> | <lastName> | <email> | <monthOfBirth> | <dayOfBirth> | <yearOfBirth> | <zip> | <passWord>| <confirmPassword> |
    Then he faced an account registration successful message
    | confirmationMessage |
    | <confirmationMessage> |

    Examples:
      |firstName| lastName  | email            | monthOfBirth | dayOfBirth | yearOfBirth | zip     | passWord| confirmPassword | confirmationMessage |
      |Felipe   | Lema | felipelema@gmail.com | November         | 5           | 1994        | 050034 | ContrasePrueba1887| ContrasePrueba1887 | UnExitoDeRegistro |