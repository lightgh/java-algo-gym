package datastructures.arraychallenges;

import java.util.Arrays;

public class RemoveFinalEvenIntegers {
    public static void main(String[] args) {
        int[] intNumbers = {1, 2, 4, 5, 10, 6, 3}; // N

        int noOfEven = 0; // O(N)
        for (int num : intNumbers) {
            if (num % 2 != 0) noOfEven++;
        }

        int[] oddNumbers = new int[noOfEven];
        int count = 0;

        // O(N)
        for (int eachNum : intNumbers) {
            if (eachNum % 2 != 0) {
                oddNumbers[count++] = eachNum;
            }
        }

        System.out.println("All-Numbers: " + Arrays.toString(intNumbers));
        System.out.println("Odd-Numbers: " + Arrays.toString(oddNumbers));

        // Complexity is O(n) + O(n) => O(n)

    }
}
