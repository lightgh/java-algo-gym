package datastructures.sort;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int firstArray[] = {1, 2, 5, 6, 8};
        int secondArray[] = { 4, 6, 7, 8, 10};

        int mergedArray[] = mergeArray(firstArray, secondArray);

        System.out.println(Arrays.toString(mergedArray));

    }

    private static int[] mergeArray(int[] firstArray, int[] secondArray) {

        int[] finalArray = new int[firstArray.length + secondArray.length];

        int firstALength = firstArray.length, firstACount = 0;
        int secondALength = secondArray.length, secondACount = 0;
        int finalALength = finalArray.length, finalACount = 0;

        while ( firstACount < firstALength && secondACount < secondALength){
            if(firstArray[firstACount] < secondArray[secondACount]) {
                finalArray[finalACount++] = firstArray[firstACount++];
            }else{
                finalArray[finalACount++] = secondArray[secondACount++];
            }
        }

        while(firstACount < firstALength){
            finalArray[finalACount++] = firstArray[firstACount++];
        }

        while(secondACount < secondALength){
            finalArray[finalACount++] = secondArray[secondACount++];
        }

        return finalArray;
    }
}
