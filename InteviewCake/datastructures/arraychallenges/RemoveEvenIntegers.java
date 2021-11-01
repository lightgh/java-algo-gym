package datastructures.arraychallenges;

import java.util.Arrays;

public class RemoveEvenIntegers {
    public static void main(String[] args) {
//        int[] arrayOfNumbers = {1, 3, 2, 4, 4, 3, 2, 8,7, 3, 0};
        int[] arrayOfNumbers = {1, 2, 4, 5, 10, 6, 3};

        int[] filteredArray = new int[arrayOfNumbers.length];
        int count = 0;

        for( int j = 0; j < arrayOfNumbers.length; j++ ){
            if(arrayOfNumbers[j] % 2 != 0){
                filteredArray[count] = arrayOfNumbers[j];
                count++;
            }
        }

        int[] finalFilteredArray = new int[count];
        for(int g = 0; g < finalFilteredArray.length; g++){
            finalFilteredArray[g] = filteredArray[g];
        }

        System.out.println("Given-Array=> " + Arrays.toString(arrayOfNumbers));
        System.out.println("Filtered-Array=> " + Arrays.toString(finalFilteredArray));
    }
}
