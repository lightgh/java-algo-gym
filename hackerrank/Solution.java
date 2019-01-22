import java.io.*;
import java.util.*;
import java.util.function.Consumer;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        ArrayList<Integer> intList = new ArrayList<>(num);
        
        int araySize = intList.size();
        
        for(int i=0; i<num; i++){
            intList.add(i, in.nextInt());
        }
        
        intList.forEach(new Consumer<Integer>(){ 
            public void accept(Integer t){
                System.out.println(t);
            }
        });
    }
}