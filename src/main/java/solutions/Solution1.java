package solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    private static final String FILE_PATH = "src/main/resources/Dictionary.txt";

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.doesFileExist(FILE_PATH);
        solution1.printWordWithMeaningsFromFile(FILE_PATH);
    }

    /* a) Create a method called doesFileExist(String path) which takes the path of the file and tells the user if the file exists at that path or not.
     * Assume all paths are relative to your project structure. If the file does not exist, catch the requisite exception.
     */
    public boolean doesFileExist(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

    /*
     * b) Read each word and its possible meanings and print them out. Your output should look like this:
     *  Word1
     *  Meaning 1
     *  Meaning 2
     *  Word2
     *  Meaning1
     *  Meaning2
     *  Use appropriate data structures wherever necessary.
     */
    public void printWordWithMeaningsFromFile(String filePath) {
        String line;
        try (BufferedReader dictionary = new BufferedReader(new FileReader(filePath))) {
            while ((line = dictionary.readLine()) != null) {
                List<String> result = extractWordAndMeanings(line);
                for (String s : result) {
                    System.out.println(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> extractWordAndMeanings(String line) {
        List<String> result = new ArrayList<>();

        String[] splitWithDash = line.split("-");

        result.add(splitWithDash[0].trim());
        if (splitWithDash.length == 2) {
            String meanings = splitWithDash[1].trim();
            if (meanings.contains(",")) {
                String[] split = meanings.split(",");
                for (String s : split) {
                    result.add(s.trim());
                }
            } else {
                result.add(meanings.trim());
            }
        }
        return result;
    }
}