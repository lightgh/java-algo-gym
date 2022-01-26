package basicdrills.arrays;

import java.util.Arrays;

public class VisitingFundamentals {
    public static void main(String[] args) {
        int[] evenNumbers = new int[12];

        int oddNumbers[] = new int[13];

        int[] arrNum = {1, 2, 4, 5, 10, 6, 3};

        System.out.println("BEFORE-FILTER: " + Arrays.toString(arrNum));
        System.out.println("AFTER-FILTERING: " + Arrays.toString(removeEven(arrNum)));


        System.out.println("BEFORE SORTING: ");
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};

        System.out.println("ARR1 => " + Arrays.toString(arr1));
        System.out.println("ARR2 => " + Arrays.toString(arr2));

        System.out.println("SORTED-ARRAY");
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));




    }


    // Big-O-Notaion: O(N)
    public static int[] removeEven(int[] arr){

        int resultantArrayCount = 0;

        for ( int i = 0; i < arr.length; i++ ){
            if(arr[i] % 2 != 0){
                resultantArrayCount++;
            }
        }

        int outcomeArray[] = new int[resultantArrayCount];

        int oddCounter = 0;
        for(int j = 0; j < arr.length; j++){
            if( arr[j] % 2 != 0 ) {
                outcomeArray[oddCounter++] = arr[j];
            }
        }

        return outcomeArray;
    }

    // Big-O-Notation O(m + n)
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        // declare an array that hold the combination of both arrays
        int [] sortedArray =  new int[arr1.length + arr2.length];

        int arr1Counter = 0;
        int arr2Counter = 0;

        int sortedElementCount = 0;

        while( arr1Counter < arr1.length && arr2Counter < arr2.length ){
            if (arr1[arr1Counter] < arr2[arr2Counter]){
                sortedArray[sortedElementCount++] = arr1[arr1Counter++] ;
            } else {
                sortedArray[sortedElementCount++] = arr2[arr2Counter++] ;
            }
        }

        while( arr1Counter < arr1.length ) {
            sortedArray[sortedElementCount++] = arr1[arr1Counter++];
        }

        while( arr2Counter < arr2.length ) {
            sortedArray[sortedElementCount++] = arr2[arr2Counter++];
        }
        return sortedArray;
    }
    // => Practice Sorting Algorithm (QuickSort)
}
