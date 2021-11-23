/*
* I/O
* Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and
* counts the occurrence of all the different characters. Save the results in a text file.
*
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Assignment11 {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> characterCount = new HashMap();
        String fileName = args[0];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        for(String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            char[] charArray = line.toCharArray();
            for(char ch: charArray) {
                characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
        bufferedWriter.write("\n\n");
        bufferedWriter.write("Individual Character count: ");
        bufferedWriter.write("\n\n");
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            bufferedWriter.write("Character " + entry.getKey() + " encountered " + entry.getValue() + " times\n");
        }
        bufferedWriter.close();
    }
}
