package datastructures.arrays;

public class GeneralA {
    public static void main(String[] args) {

        String[] array1 = new String[10];
        String array2[] = new String[10];

        char[] charsArray = new char[10];
        char[] charsArray2 = new char[2];

        int[] numArray = new int[4];

        for(int i = 0; i < numArray.length; i++){
            System.out.println(numArray[0]);
        }

        int[][] a = new int[10][10];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++ ){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");

        int[][] b1 = {{7, 5, 4, 4, 2}, {90, 43, 8, 9, 23}, {8, 3, 2, 33, 2 }};

        for(int k = 0; k < b1.length; k++){
            for(int l = 0; l < b1[k].length; l++){
                System.out.printf( "%d ", b1[k][l] );
            }
            System.out.println();
        }






    }
}
