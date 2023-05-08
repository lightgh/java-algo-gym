package codingDrills.strings;

import java.util.LinkedList;
import java.util.List;

public class Solution1StrParanthesis {

    public static void main(String[] args) {
        Solution1StrParanthesis s1 = new Solution1StrParanthesis();
        int num = 4;
        List<String> result = s1.generateParentheis(num);
        System.out.println(result);
    }

    public List<String> generateParentheis(int num){
        List<String> result = new LinkedList<>();
        process("", num, num, result);
        return result;
    }

    //Recursion
    public void process(String prefix, int left, int right, List<String> result ){
        if(left == 0 && right == 0){
            result.add(prefix);
            return;
        }
        if(left > 0){
            process(prefix + '(', left -1, right, result);
        }

        if(left < right){
            process(prefix + ')', left, right -1, result);
        }
    }

    /**
     * Learn/Practice-Recursion
     */


}
