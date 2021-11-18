package Assignment5.assignment.data;

public class TempClass1 {
    int number;
    char character;

    public void printVariables() {
        System.out.println("number: " + number);
        System.out.println("character: " + character);
    }

/*
 This Doesn't work, because Local variables don't have any default value, So they must be initialized before use.
 The compiler gives an error when we try to use an uninitialized value.

    public void printLocalVaribles() {
        int localNumber;
        char localCharacter;
        System.out.println("local number: " + localNumber);
        System.out.println("local character: " + localCharacter);
    }
*/

}