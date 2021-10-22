package drillocpjp8;

public class DateConceptDrill {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;

        int [][] my2DArray;
        my2DArray = new int[rows][columns];

        System.out.println("You have successfully created a 2DArray");

        int [][][] my3DArray;
        my3DArray = new int[5][4][4];
        System.out.println("You have successfully created a 3DArray");

        int [][][][] my4DArray;
        my4DArray = new int[3][4][5][6];
        System.out.println("You have successfully created a 4DArray");

        int [][][][][][][][][][] my10DArray;
        my10DArray = new int[3][3][3][4][4][4][5][5][5][6];
        System.out.println("You have successfully created a 10DArray");
    }
}