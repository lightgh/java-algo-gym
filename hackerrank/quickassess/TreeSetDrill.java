package quickassess;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDrill {

    public static void main(String[] args) {
        TreeSet<Integer> numSet = new TreeSet<>();
        numSet.add(45);
        numSet.add(3);
        numSet.add(90);
        numSet.add(-23);

        System.out.println("Sorted TreeSet Elements");
        System.out.println(numSet);

        TreeSet<Integer> revNumSet = new TreeSet<>(Comparator.reverseOrder());
        revNumSet.add(45);
        revNumSet.add(3);
        revNumSet.add(90);
        revNumSet.add(-23);

        System.out.println("Sorted TreeSet Elements-Reversed");
        System.out.println(revNumSet);

        System.out.println("revNumSet.headSet(45) = " + revNumSet.headSet(45));
        System.out.println("revNumSet.tailSet(45) = " + revNumSet.tailSet(45));

        System.out.println(revNumSet.stream().max(Comparator.comparingInt(e -> e.intValue())).get());

        System.out.println("numSet.first() = " + numSet.first());
        System.out.println("numSet.last() = " + numSet.last());

    }
}
