import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Solution1 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int max = 0;
        int sumL = 0;
        
        for(int i=0; i < 4; i++){
            
            for( int j=0; j<4; j++){
                    
                sumL = sumL +  arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]
                    + arr[i+2][j+1] +  arr[i+2][j+2] ;
                
                 if(max < sumL){
                     max = sumL; 
                 }
                sumL = 0;
            }
             
            }
            
            System.out.println(max);
            scanner.close();
        }
        
}

