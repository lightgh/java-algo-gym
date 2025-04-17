package codingDrills;

import java.util.Arrays;

public class SampleClass {


    public static void main(String[] args) {
        int[] nums = {1, 9, 15, 4, 5, 6, 7, 8, 12, 21};
        int targetSum = 31;

        Arrays.sort(nums); // 1,4, 5, 6

        int firstPointer = 0;
        int secondPointer = 1;
        int thirdPointer = 2;


        int tempSum = 0;
        for (int i = 0; i < nums.length - 3; i++) {
            tempSum = nums[firstPointer++] + nums[secondPointer++] + nums[thirdPointer++];
            if(tempSum > targetSum) {

            }
            System.out.println(tempSum);
        }
    }
}
