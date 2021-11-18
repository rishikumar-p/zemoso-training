/*
 * Question: write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {

    public static boolean checkCondition(String input){
        String REGEX = "^[A-Z].*[.]$";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);
        return  matcher.find();
    }

    public static void main(String[] args){
        String input1 = "Hello World.";
        String input2 = "Hello World";
        String input3 = "hello World.";
        String input4 = "hello World";

        System.out.println(checkCondition(input1)); // returns true
        System.out.println(checkCondition(input2)); // returns false
        System.out.println(checkCondition(input3)); // returns false
        System.out.println(checkCondition(input4)); // returns false

    }
}
