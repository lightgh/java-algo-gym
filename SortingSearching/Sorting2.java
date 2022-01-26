import java.util.Arrays;

public class Sorting2 {

    public static void selectionSort(int[] arr, int arrSize){
        int midInd;

        for(int i = 0; i < arrSize; i++) {

            midInd = HelperFunc.minInd(arr, i, arrSize - 1);

            int temp = arr[i];
            arr[i] = arr[midInd];
            arr[midInd] = temp;

        }
    }

    public static void main(String[] args) {
        int arr[] = {34, 4, 2, 11, 89, 100, -388, 89};
        int arrSize = arr.length;
        System.out.println("BEFORE: " + Arrays.toString(arr));
        selectionSort(arr, arrSize);
        System.out.println("AFTER: " + Arrays.toString(arr));
    }
}
