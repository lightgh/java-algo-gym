package slidingwindowpattern;


/**
 * Problem Statement#
 * Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
 *
 * Example 1:
 *
 * Input: [2, 1, 5, 1, 3, 2], k=3
 * Output: 9
 * Explanation: Subarray with maximum sum is [5, 1, 3].
 */
public class MaxSumSubArrays {

    public static void main(String[] args) {
        /*
        Input [2, 1, 5, 1, 3, 2], k=3
        Process:
              [2, 1, 5, 1, 3, 2]
              [2, 1, 5]
                  [1, 5, 1]
                      [5, 1, 3]
                         [1, 3, 2]
         */

        int[] arrayInput = {2, 1, 5, 1, 3, 2};
        int maxSum = sumOfSubArrays(3, arrayInput);
        System.out.println("maxSum = " + maxSum);

        int maxSum2 = sumOfSubArrays(2, new int[] { 2, 3, 4, 1, 5 });
        System.out.println("maxSum = " + maxSum2);

    }

    public static int sumOfSubArrays(int k, int[] arrayInput) {

        int maxSum = 0;
        int subArrayLength = arrayInput.length - k + 1;

        int windowSum = 0;
        int windowEnd = 0;
        int windowStart = 0;

        int maxSumStartIndex = 0;
        int maxSumStopIndex = 0;

        for ( windowEnd = 0; windowEnd < arrayInput.length; windowEnd++ ){
            windowSum += arrayInput[windowEnd];

            if (windowEnd >= k - 1) {
//                maxSum = Math.max(maxSum, windowSum);
                if(windowSum > maxSum){
                    maxSum = windowSum;
                    maxSumStartIndex = windowStart;
                    maxSumStopIndex = windowEnd;
                }
                windowSum -= arrayInput[windowStart++];
            }
        }


        System.out.println("Max Sum Array is: ");

        System.out.print("[ ");
        for (int i = maxSumStartIndex; i <= maxSumStopIndex; i++) {
            System.out.print(arrayInput[i] + " ");
        }
        System.out.println(" ]");
        return maxSum;

    }
}
