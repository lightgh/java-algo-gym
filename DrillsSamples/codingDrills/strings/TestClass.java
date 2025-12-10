package codingDrills.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {

        /**
         * Input: 12,15,16,17,20,23,24,25,60,91,92,93,95
         * O/P: 12,[15-17],20,[23-25],60,[91-93],95
         *
         * display in a form of range
         *
         */           //0, 1
        int[] input = {12,15,16,17,20,23,24,25,60,91,92,93,95};

        List<Object> list = new ArrayList<>();
        int i = 0;
        while(i < input.length) {
            int start = input[i];
            int end = start;

            while(i + 1 < input.length && input[i + 1] == input[i] + 1){
              i++;
              end = input[i];
            }

            if(start != end) {
                list.add(Arrays.asList(start, end));
            }else{
                list.add(start);
            }
            i++;
        }

        System.out.println("Result = " + list);

    }
}
