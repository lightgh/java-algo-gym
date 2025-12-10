package codingDrills.strings;

/**
 * you are given an array of integers. Your task is to determine the length of the longest subsequence such that all elements of the subsequence are strictly increasing. A subsequence is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements. Return a single integer representing the length of the longest strictly increasing subsequence.
 *
 * int[] input = {10, 9, 2, 5, 3, 7, 101, 18};
 * lengthOfLIS(input); // returns 4
 *
 * Explanation: The longest increasing subsequence is [2, 3, 7, 101].
 *
 */
public class Test {

    public static void main(String[] args) {

        int[] input = {10, 9, 2, 5, 3, 7, 101, 18};
        int outcome = lengthOfLIS(input);
        System.out.println("outcome = " + outcome);
    }

    private static int lengthOfLIS(int[] input) {
        if(input == null || input.length == 0) return 0;
        int[] dp = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            dp[i] = 1;
        }
        int maxLength = 1;

        int[] listofA = new int[input.length];
        int iT = 0;

        for (int i = 1; i < input.length; i++) {
            int val = 0;
            for (int j = 0; j < i; j++) {
                if(input[i] > input[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    val = input[dp[i]];
                }
            }
           maxLength = Math.max(maxLength, dp[i]);
            listofA[iT++] = input[i];
        }

        return maxLength;
    }
}
