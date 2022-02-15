package quickassess;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class FailFast {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Simi");
        nameList.add("Esther");
        nameList.add("Peterson");
        nameList.add("Anderson");

        nameList.forEach(ea -> {
//            nameList.add("Kingson");
            System.out.println(ea);
//            nameList.remove(ea);
        });

        nameList.remove("Peterson");
        System.out.println("========Divider=======");

        nameList.forEach(eb -> {
            System.out.println(eb);
        });

        Iterator<String> stringIterator = nameList.iterator();
        stringIterator.forEachRemaining(eaR -> {
            System.out.println("eaR = " + eaR);
            nameList.add("Naominh");
        });

        List<Integer> integerList = new CopyOnWriteArrayList<>();

        IntStream.rangeClosed(30, 50).forEach(e -> {
            integerList.add(e);
        });

        System.out.println("BEFORE:-WORKING-ON-IT: " + integerList);


        System.out.println("WHILE:-WORKING-ON-IT: ");

        integerList.forEach(eacV -> {
            if (eacV == 37 || eacV == 47) {
                System.out.println("Removing the Value: " + eacV);
                integerList.remove(eacV);
            }
            System.out.println(eacV);
        });

        System.out.println("After Removing the Elements: ");
        System.out.println("integerList = " + integerList);




    }
}
