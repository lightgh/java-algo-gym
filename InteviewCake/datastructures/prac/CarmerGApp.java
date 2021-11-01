package datastructures.prac;

class CarmerGApp {


    static void findNRecaman(int n) {
        // N - Array
        int nArrays[] = new int[n];

        nArrays[0] = 0;
        System.out.print(nArrays[0] + " ,");

        for (int i = 1; i < n; i++) {
            int currentItem = nArrays[i - 1] - i;
            int j;
            for (j = 0; j < i; j++) {
                if ((nArrays[j] == currentItem) || currentItem < 0) {
                    currentItem = nArrays[i - 1] + i;
                    break;
                }
            }

            nArrays[i] = currentItem;
            System.out.printf( "%d , ", nArrays[i]);

        }
    }

    public static void main (String[] args)
    {
        int n = 17;
        findNRecaman(n);

    }
}