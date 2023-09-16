package javaocpjpprep.lambdadril;

import java.util.Comparator;
import java.util.function.Function;

public class LambdaDrill {
    public static void main(String[] args) {
        System.out.println("LambdaDrill Practice");
        Comparator<String> byWeight = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o1.compareTo(o2);
            }
        };

        Comparator<String> byWeightS = String::compareTo;

        Comparator<Integer> compareInteger = (intA, intB) -> intA + intB;

        compareInteger.compare(34, 67);

//        Integer  addTwoInteger = ( intA,  intB) ->  intA + intB;
    }
}

@FunctionalInterface
interface  addIntegerInt{
    Integer addTwoInteger( Integer intA, Integer intB);
}
