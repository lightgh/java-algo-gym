package javaocpjpprep.lambdadril;

import java.util.ArrayList;
import java.util.List;

public class CollectionDrillsA {
    public static void main(String[] args) {
        List<Integer> numbersA = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> numbers = List.of(1, 2, 3);
//        numbers.remove(1);
        System.out.printf("After Removed: " + numbers);

        numbersA.remove(Integer.valueOf(2));
        System.out.println("NumberA-1: " + numbersA);

        numbersA.remove(0);

        System.out.println("NumberA-2: " + numbersA);


        System.out.println("====================");
        int x = 1;
        for (int i = 1; i <= 128; i += i) {
            x += x;
        }

        System.out.println("O=>X: " + x);

//        Obj s = new Obj();

    }
    class Obj {

    }

    class Obj2 {

    }
}
