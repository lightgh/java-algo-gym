package slidingwindowpattern;

import java.util.Arrays;

public class SlidingPatternIntro {
    public static void main(String[] args) {

        int[] slideArray = {1, 3, 2, 6, -1, 4, 1, 8, 2};

        int subASize = 5; // 0 - 4 // < 5

        // 9 [0 - 8] // < 9

        /*

        [1, 3, 2, 6, -1]/5 => 11/5 => 2.2
           [3, 2, 6, -1, 4]/5 => 14/5 => 2.8
              [2, 6, -1, 4, 1] => 12/5 => 2.4
                 [6, -1, 4, 1, 8] => 18/5 => 3.6
                    [-1, 4, 1, 8, 2] => 14/5 => 2.8

         Final-Output: [2.2, 2.8, 2.4, 3.6, 2.8]

         */

        double[] firstComputation = findAverages(subASize, slideArray);
        double[] secondComputation = findAveragesUsingWindowSlide(subASize, slideArray);

        System.out.println("Are the Arrays Outcome Same?: " + Arrays.equals(firstComputation, secondComputation) );
    }

    public static double[] findAverages(int k, int[] array) {
        System.out.println("findAverages-array = " + Arrays.toString(array));
        int totalArrayLength = array.length; // (1)

        int lengthOfNewArray = totalArrayLength - k + 1; // (1)
        double finalAvg[] = new double[lengthOfNewArray];  // (1)

        for ( int i = 0; i <= totalArrayLength - k; i++) {  // (N)
            double sum = 0.0;
            for(int j = i; j < i + k; j++ )  // (K)
                sum += array[j];  // (1)
            finalAvg[i] = sum/k;  // (1)
        }

        System.out.println("Average of Sub Array of Size K =: " + k );
        System.out.println(Arrays.toString(finalAvg));
        System.out.println("Final Avg Array Size is: " + finalAvg.length);

        return finalAvg;
    }

    public static double[] findAveragesUsingWindowSlide(int k, int[] array) {

        System.out.println("findAveragesUsingWindowSlide-array = " + Arrays.toString(array));
        int totalArrayLength = array.length; // (1)

        int lengthOfNewArray = totalArrayLength - k + 1; // (1)
        double resultantArray[] = new double[lengthOfNewArray];  // (1)

        double windowSum = 0;
        int windowStart = 0;
        int resultIndex = 0;

        for ( int windowEnd = 0; windowEnd < totalArrayLength; windowEnd++ ) {  // (N)
            windowSum = windowSum + array[windowEnd];  // (1)

            if(windowEnd >= k - 1) {
                double tmpAvg = windowSum / k;
                System.out.println("tmpAvg = " + tmpAvg);
                System.out.println("resultIndex++ = " + resultIndex);

                resultantArray[resultIndex++] = tmpAvg;
                windowSum -= array[windowStart++];
            }

        }

        System.out.println("Average of Sub Array of Size K =: " + k );
        System.out.println(Arrays.toString(resultantArray));
        System.out.println("Final Avg Array Size is: " + resultantArray.length);

        return resultantArray;
    }


}
