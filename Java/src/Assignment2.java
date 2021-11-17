/*
*   Question: Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive)
*
*   Time Complexity : O(N)
*   Space Complexity : O(N)
*
 */

import java.util.*;

public class Assignment2 {

    public static boolean doesContainsAllLowerCaseAlphabets(String input){
        Set<Character> characterSet = new HashSet<>();
        char[] inputCharArray = input.toCharArray();
        for(char ch: inputCharArray){
            if(Character.isAlphabetic(ch)){
                characterSet.add(Character.toLowerCase(ch));
            }
        }
        return characterSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String inputString = scan.next();
        if(doesContainsAllLowerCaseAlphabets(inputString))
            System.out.println("The String Contains all the alphabets(a-z)");
        else
            System.out.println("The String Doesn't contain all the alphabets(a-z)");
    }

}
