package datastructures.arraychallenges;

import java.util.Arrays;

public class MergeTwoSortedArrayFirst {
    public static void main(String[] args) {

        int[] l1 = {1, 2, 4};
        int[] l2 = {1, 3, 4};

        int finalArrayLength = l1.length + l2.length;
        int[] finalArray = new int[finalArrayLength];

        int finalIndex = 0;
        int navigationFirstIndex = 0;
        int navigationSecondIndex = 0;
        while ( navigationFirstIndex < l1.length && navigationSecondIndex < l2.length ) {
            if(l1[navigationFirstIndex] < l2[navigationSecondIndex]){
                finalArray[finalIndex++] = l1[navigationFirstIndex++];
            }else{
                finalArray[finalIndex++] = l2[navigationSecondIndex++];
            }
        }

        while(navigationFirstIndex < l1.length){
            finalArray[finalIndex++] = l1[navigationFirstIndex++];
        }

        while(navigationSecondIndex < l2.length){
            finalArray[finalIndex++] = l2[navigationSecondIndex++];
        }


        System.out.println("First-Array: " + Arrays.toString(l1));
        System.out.println("Second-Array: " + Arrays.toString(l2));

        System.out.println("Final-Array: " + Arrays.toString(finalArray));

    }
}
