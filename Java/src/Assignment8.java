/*
* Java Assignment 8: Error Handling
* Create three new types of exceptions. Write a class with a method that throws all three. In main( ),
* call the method but only use a single catch clause that will catch all three types of exceptions.
* Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
*
*/

class InvalidCredentials extends Exception {
    InvalidCredentials(String string) {
        super(string);
    }
}

class InvalidName extends InvalidCredentials {
    InvalidName(String string) {
        super(string);
    }
}

class InvalidPassword extends InvalidCredentials {
    InvalidPassword(String string) {
        super(string);
    }
}

class InvalidAge extends InvalidCredentials {
    InvalidAge(String string) {
        super(string);
    }
}

public class Assignment8 {
    public static void validateCredentials(String name, String password, int age) {
        try {
            if (name == null || name.length() < 2 || name.length() > 80) {
                throw new InvalidName("Invalid Name");
            }
            if (password == null || password.length() < 4 || password.length() > 80){
                throw new InvalidPassword("Invalid Password");
            }
            if(age <= 18 || age > 110) {
                throw new InvalidAge("Invalid age");
            }
        }
        catch (InvalidCredentials  | NullPointerException exception) {
            exception.printStackTrace();
        }
    }
    public static void main(String[] args){
        try {
            validateCredentials("John", "abc123", 19);
            throw new NullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("It is Finally block");
        }
    }
}
