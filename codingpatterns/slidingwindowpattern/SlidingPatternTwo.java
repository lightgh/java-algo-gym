package slidingwindowpattern;

import java.util.Arrays;

public class SlidingPatternTwo {
    public static void main(String[] args) {

        int arrayInputs[] = {-1, 2, 34, 4, 2, 8, 4, 2, 3, 2, 4};
        int subArrayLength = 5;

        /*
                arrayInputs = [ -1, 2, 34, 4, 2, 8, 4, 2, 3, 2, 4 ]

                SubArrays:
                    [-1, 2, 34, 4, 2 ]
                         [2, 34, 4, 2, 8 ]
                            [34, 4, 2, 8, 4 ]
                              [ 4, 2, 8, 4, 2]
                                [ 2, 8, 4, 2, 3]

         */

        subArrayAverage(subArrayLength, arrayInputs);

    }

    private static void subArrayAverage(int subArrayLength, int[] arrayInputs) {

        int lengthOfResultantArray = arrayInputs.length - subArrayLength + 1;

        double resultantAverageArray[] = new double[lengthOfResultantArray];

        double windowSum = 0.0;
        int windowStart = 0;
        int resultArrayCount = 0;

        /**
         *  [ -1, 2, 34, 4, 2, 8, 4, 2, 3, 2, 4 ]
         *  [ -1, 2, 34, 4, 2, 8, 4, 2, 3, 2, 4 ]
         */


        for ( int windowEnd = 0;  windowEnd < arrayInputs.length; windowEnd++ ) {
                windowSum += arrayInputs[windowEnd];

                if(windowEnd >= subArrayLength){
                    resultantAverageArray[resultArrayCount++] = windowSum / subArrayLength;
                    windowSum = windowSum - arrayInputs[windowStart];
                    windowStart++;
                }
        }
        System.out.println("resultantAverageArray = " + Arrays.toString(resultantAverageArray));
    }
}
