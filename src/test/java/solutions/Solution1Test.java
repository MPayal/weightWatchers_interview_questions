package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void doesFileExist() {
        Solution1 testClass = new Solution1();
        assertTrue(testClass.doesFileExist("src/main/resources/Dictionary.txt"));
        assertFalse(testClass.doesFileExist("src/main/resources/Dictionary1.txt"));
    }

    @Test
    public void printWordWithMeaningsFromFile() {
        Solution1 testClass = new Solution1();
        testClass.printWordWithMeaningsFromFile("src/main/resources/Dictionary.txt");
    }
}