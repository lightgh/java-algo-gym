package educative;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TargetSum {
    public static void main(String[] args) {
        targetSumImplementation();
        findOccurrenceOfWordsInString();

    }

    private static void findOccurrenceOfWordsInString() {
        System.out.println("Method findOccurrenceOfWordsInString Implementation");
        String concatenatedWords = "rich men are always a step ahead in getting rich compared to the less wealthy men talk less when compared to the trading men";
        String [] words = concatenatedWords.split(" ");
        Map<String, Integer> occurrenceOfWordsInString = new HashMap<>();
        for (String word : words) {
            if(occurrenceOfWordsInString.containsKey(word)) {
                occurrenceOfWordsInString.put(word, occurrenceOfWordsInString.get(word) + 1);
            }else{
                occurrenceOfWordsInString.put(word, 1);
            }
        }

        System.out.println("OccurrenceOf-Words: " + occurrenceOfWordsInString);

    }

    private static void targetSumImplementation() {
        int [] arrayOfInts = new int[]{10, 11, 1, 2, 7};
        int targetSum = 18;
        int temp;
        Map<Integer, Integer> targetSumMap = new HashMap<>();
        for (int i = 0; i < arrayOfInts.length; i++) {
            temp = targetSum - arrayOfInts[i]; // get temp targetSum diff

            if(!targetSumMap.containsKey(temp)){
                targetSumMap.put(arrayOfInts[i], i);
            }else {
                int res = targetSumMap.get(temp);
                System.out.printf("The index targeting the sum of target %d is %d and %d : Summing Up Index Values %d + %d = %d",
                        targetSum,  i, res, arrayOfInts[i], arrayOfInts[res], (arrayOfInts[i] + arrayOfInts[res]));
                break;
            }
        }
    }
}
