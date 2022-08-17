package multithreading;

public class SumUpExample {
    long startRange;
    long endRange;
    long counter = 0;

    static long MAX_NUM = Integer.MAX_VALUE;

    public SumUpExample(long startRange, long endRange){
        this.startRange = startRange;
        this.endRange = endRange;
    }

    public void add() {
        for (long i = startRange; i <= endRange ; i++) {
            counter += i;
        }
    }

    static public void twoThreads() throws InterruptedException {

    }
}