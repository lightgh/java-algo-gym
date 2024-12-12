package designpatterns.behavioural.strategy.sortsamp1;

public class Client {
    private int[] numbers = new int[1000];

    void crunchingNumbers() {
        //Choose the sorting strategy
        BubbleSort bubbleSort = new BubbleSort();
        Context context = new Context(bubbleSort);
        context.sort(numbers);
    }
}
