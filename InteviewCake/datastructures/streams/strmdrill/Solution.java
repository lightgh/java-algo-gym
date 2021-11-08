package datastructures.streams.strmdrill;

import java.util.Stack;

import java.util.*;

class Solution {

    public static void main(String[] args) {

        int[] arr = {6, 42, 11, 7, 1, 42};
        int res = solution(7, 42, arr );
        System.out.println("1st Test Case: => " + res);

        int[] arr2 = {13, 13, 1, 6};
        int res2 = solution(6, 13, arr2 );
        System.out.println("2nd Test Case: => " + res2);


        int[] arr3 = {100, 63, 1, 6, 2, 13};
        int res3 = solution(100, 63, arr3 );
        System.out.println("3rd Test Case: => " + res3);


    }

    static int solution(int X, int Y, int[] A) {

        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }

        return result;
    }
}