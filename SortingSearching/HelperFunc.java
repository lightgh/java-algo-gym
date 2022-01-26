public class HelperFunc {

    public static int minInd(int[] arr, int start, int end) {
        if (start < 0 || end <= 0) return 0;

        int minInd = start;

        for(int i = start + 1; i <= end; i++){
            if(arr[minInd] > arr[i]){
                minInd = i;
            }
        }

        return minInd;
    }
}
