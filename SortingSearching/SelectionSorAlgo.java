import java.util.Arrays;

public class SelectionSorAlgo {

    public static void main(String[] args) {
        int[] arr = {34, 12, 2, 44, 2, -190, 789, 34, 1, 9};
        int arrSize = arr.length;

        System.out.println("BEFORE SORTING");
        QuickHelp.printArray(arr, arr.length);

        selectionSort(arr, arrSize);

        QuickHelp.printArray(arr, arr.length);

    }

    private static void selectionSort(int[] arr, int arrSize) {
        int minIndex;

        for(int i = 0; i < arrSize; i++) {
            minIndex = QuickHelp.minIndex(arr, i, arrSize - 1);

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }


}

class QuickHelp {
    static int minIndex(int [] arr, int start, int end){
        if(start < 0 || end <= 0) return 0;

        int minInd = start;

        for(int i = start + 1; i <= end; i++){
            if(arr[minInd] > arr[i]){
                minInd = i;
            }
        }
        return minInd;
    }

    static void printArray(int [] arr, int arrSize){
        for(int i = 0 ; i < arr.length; i++ ){
            System.out.println( arr[i] + " " );
        }
    }
}
