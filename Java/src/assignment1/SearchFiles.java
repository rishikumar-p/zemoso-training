package assignment1;

/*
 * Create a java program to search through the home directory and look for files that match a regular expression.
 * The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
*/

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFiles {
    File file;

    public SearchFiles(File file) {
        this.file = file;
    }

    public ArrayList<String> getFilesWithPattern( String inputPattern) {
        String[] fileNames = file.list();
        Pattern pattern = Pattern.compile(inputPattern);
        ArrayList<String> matchedFiles = new ArrayList<>();
        for( String name : fileNames ) {
            Matcher matcher = pattern.matcher(name);
            if(matcher.find()) {
                matchedFiles.add("/home/rishkp/" + name);
            }
        }
        return matchedFiles;
    }

    public static void main(String[] args){
        SearchFiles searchFiles = new SearchFiles(new File("/home/rishkp/"));
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> matchedFiles;
        while(true){
            System.out.print("Do you want to search for a pattern [Y/N] : ");
            if(scanner.next().charAt(0) == 'Y') {
                System.out.print("Enter a pattern to search: ");
                String inputPattern = scanner.next();
                matchedFiles = searchFiles.getFilesWithPattern(inputPattern);
                System.out.println("Matched Files: ");
                for (String name : matchedFiles) {
                    System.out.println(name);
                }
                System.out.println(matchedFiles.size());
            }
            else break;
        }
    }
}
