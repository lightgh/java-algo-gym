package slidingwindowpattern;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubArrayWithGreaterSum {
    public static void main(String[] args) {

//        int[] inputArray = { 2, 1, 5, 2, 3, 2 };
//        int[] inputArray = { 2, 1, 5, 2, 8 };
        int[] inputArray = { 3, 4, 1, 1, 6 };

//        int targetSmallestSum = 7;
        int targetSmallestSum = 8;

        int length = smallestArrayWithGivenSum(targetSmallestSum, inputArray);

        System.out.println("Longest SubString With Maximum K Distinct Characters:");
        System.out.println(SmallestSubArrayWithGreaterSum.findLongestSubStringWithMaximumKDistinctCharacters("araaci",2 ));
        System.out.println(SmallestSubArrayWithGreaterSum.findLongestSubStringWithMaximumKDistinctCharacters("araaci",1 ));

        System.out.println("<<<=================================================>>>");
        System.out.println(SmallestSubArrayWithGreaterSum.findLengthOfLongestSubString("araaci", 2));
        System.out.println(SmallestSubArrayWithGreaterSum.findLengthOfLongestSubString("araaci", 1));

    }

    private static int smallestArrayWithGivenSum(int targetGreaterSum, int[] inputArray) {

        int windowStart = 0;
        int windowEnd = 0;
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;

        int arrayStart = 0;
        int arrayStop = 0;

        int maxValue = windowSum;

        for(windowEnd = 0; windowEnd < inputArray.length; windowEnd++){
            windowSum += inputArray[windowEnd];

            while(windowSum >= targetGreaterSum){
                arrayStart = windowStart;
                arrayStop = windowEnd;

                int tempLength = arrayStop - arrayStart + 1;

                if( (minLength > tempLength) ){
                        maxValue = windowSum;
                        minLength = tempLength;
                }

//                minLength = Math.min(minLength, (windowEnd - windowStart) + 1);
                windowSum -= inputArray[windowStart];
                windowStart++;
            }
        }

        System.out.println("MinLength : " + minLength );
        System.out.println("MinLength-Sum : " + maxValue );

        StringBuilder sb = new StringBuilder("[");
        for(int k = arrayStart; k <= arrayStop; k++){
            sb.append(inputArray[k]);
            sb.append(", ");
        }

        String sbStr = sb.substring(0, sb.toString().length()-2);

        System.out.println("sb.toString() = " + sbStr + "] ");

        return minLength;

    }

    public static int findLongestSubStringWithMaximumKDistinctCharacters( String inputString, int distictCount ) {

        /**
         *  araaci,  K=2
         *
         *
         */

        if( inputString == null || inputString.length() == 0 )
            throw new IllegalArgumentException();

        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < inputString.length(); windowEnd++) {
            char rightChar = inputString.charAt(windowEnd); // [a] raaci

            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

            while(charFrequencyMap.size() > distictCount){
                char leftChar = inputString.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);

                if ( charFrequencyMap.get(leftChar) == 0 ) {
                    charFrequencyMap.remove(leftChar);
                }
                windowStart++; // shrink the window
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }

        return maxLength;

    }

    public static int findLengthOfLongestSubString(String inputStr, int k) {


        /**
         * Time Complexity: O(M + N) => O(P)
         * Space Complexity: O(K + 1) => O(K)
         * abbstr
         *
         *  k
         *
         */

        int windowStart = 0;
        Map<Character, Integer> charFrequency = new HashMap<>();
        int maxLength = 0;

        for( int windowEnd = 0; windowEnd < inputStr.length(); windowEnd++ ){
            Character rightChar = inputStr.charAt(windowEnd);
            charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) + 1);

            while(charFrequency.size() > k){
                Character leftChar = inputStr.charAt(windowStart);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);

                if(charFrequency.get(leftChar) == 0){
                    charFrequency.remove(leftChar);
                }
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

}
