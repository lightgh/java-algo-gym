import helper.Helper;

public class Sorting {


    public static void selectionSort( int[] arr, int arrSize ){
        int minInd;

        // traverse through all elements of the array
        for( int i = 0; i < arrSize; i++ ){
            System.out.println(" COUNTER: " + i );
            minInd = Helper.findMin(arr, i, arrSize - 1);
            System.out.println(" MID: " + minInd);

            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {-5000,4,1,0,5,95,4,-100,200,0};
        int arrS = arr.length;
        selectionSort(arr, arrS);
        Helper.printArray(arr, arrS);
    }
}
