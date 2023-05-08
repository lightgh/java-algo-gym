package codingDrills.strings;

import java.util.LinkedList;
import java.util.List;

public class Solution1Parenthesis2 {
    public static void main(String[] args) {
        Solution1Parenthesis2 s1P = new Solution1Parenthesis2();
        List<String> result = s1P.generateParenthesis(3);
        System.out.println(result);
    }

    private List<String> generateParenthesis(int i) {
        List<String> result = new LinkedList<>();
        process("", i, i, result);

//        ""
//
        return result;
    }

    private void process(String prefix, int left , int right, List<String> result) {
        if(left == 0 && right == 0){ // "((())) ()()()"
            result.add(prefix);
            return;
        }

        if(left > 0){
            process(prefix + '(', left - 1, right, result);
        }

        if(left < right){
            process(prefix + ')', left, right - 1, result);
        }
    }


}