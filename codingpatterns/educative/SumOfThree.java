package educative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThree {
    public static void main(String[] args) {
        int[][] testCases = {
                {-1, 0, 3, 3, 1, -3, 4},
                {1, 2, 3, 4, 5},
                {0, 0, 0}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            System.out.println("\nTest Case " + (i + 1) + ":\n\tInput: " + Arrays.toString(nums));
            List<List<Integer>> result = threeSum(nums);
            System.out.print("\tOutput: ");
            System.out.println(result);
            System.out.println(new String(new char[100]).replace('\0', '-'));

        }
    }

    private static List<List<Integer>> threeSum(int [] nums){
        //Sort the Array:
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int pivot = 0; pivot < n - 2; pivot++){
            if(nums[pivot] > 0) {
                break;
            }

            if(pivot > 0 && nums[pivot] == nums[pivot - 1]){
                continue;
            }
            int low = pivot + 1, high = n -1;

            while(low < high){
                int total = nums[pivot] + nums[low] + nums[high];
                if(total<0){
                    low++;
                }else if(total>0){
                    high--;
                }else {
                    result.add(Arrays.asList(nums[pivot], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low - 1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high + 1]){
                        high--;
                    }
                }
            }
        }

        return result;
    }
}
