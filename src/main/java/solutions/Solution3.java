package solutions;

import java.util.Arrays;

/*
 * Generate 500 random numbers and print the nth smallest number in a programming language of your choice.
 */
public class Solution3 {

    private static final int ARRAY_SIZE = 500;

    public static void main(String[] main) {
        Solution3 randomNumbers = new Solution3();
        randomNumbers.generateRandomNumbers(2);
//        randomNumbers.generateRandomNumbers(501);
    }

    public void generateRandomNumbers(int n) {

        double[] arr = new double[ARRAY_SIZE];

        if (n < 0 || n >= ARRAY_SIZE) {
            throw new IllegalArgumentException("Invalid argument => " + n + ". Pass a number between 1 and " + ARRAY_SIZE);
        }

        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = Math.random() * 100;
        }

        Arrays.sort(arr);
        System.out.println("Array => " + Arrays.toString(arr));
        System.out.println(n + "th smallest number => " + arr[n-1]);
    }
}
