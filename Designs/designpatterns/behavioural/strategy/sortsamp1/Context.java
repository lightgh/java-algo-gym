package designpatterns.behavioural.strategy.sortsamp1;

public class Context {
    private ISort howDoISort;

    public Context(ISort howDoISort) {
        this.howDoISort = howDoISort;
    }

    // Context receives the data from its client
    // and passes it on to the strategy object.
    void sort(int[] numbers) {
        howDoISort.sort(numbers);
    }

    public void setHowDoISort(ISort howDoISort) {
        this.howDoISort = howDoISort;
    }

}
