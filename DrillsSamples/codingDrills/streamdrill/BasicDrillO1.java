package codingDrills.streamdrill;

import java.util.Arrays;

public class BasicDrillO1 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 3, 4, 3, 34};

        int sum = Arrays.stream(arr).sum();
        System.out.printf("arr sum = " + sum);

        double avg = Arrays.stream(arr).average().orElseThrow( () -> {
            return new RuntimeException();
        });


    }
}
