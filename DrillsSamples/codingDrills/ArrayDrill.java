package codingDrills;

public class ArrayDrill {
    public static void main(String[] args) {
        int[] num = {12, 5, 4, 3, 4, 3, 4};

        int max_index = findMax(num, 7);

        System.out.println("MAX-NUM: " + max_index);


        int num_index = findNum(num, 7, 4);
        if(num_index == -1){
            System.out.println("Number 4 Not Found");
        }else{
            System.out.println("Number 4 Found at Index: " + num_index);
        }

    }

    private static int findMax(int[] num, int arraySize) {
        int max_num = Integer.MIN_VALUE;
        for (int j = 0; j < arraySize; j++) {
            if(max_num < num[j]){
                max_num = num[j];
            }
        }
        return max_num;
    }

    private static int findNum(int[] num, int arraySize, int searchNumber){
        for(int j = 0; j < arraySize; j++){
            if(searchNumber == num[j]){
                return j;
            }
        }
        return -1;
    }
}
