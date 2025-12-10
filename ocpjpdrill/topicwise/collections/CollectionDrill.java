package topicwise.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class CollectionDrill {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Donald");
        set.add("Mickey");
        set.add("Minnie");
//        set.add("Minie");

        System.out.println(set.iterator().next());

        SequencedSet<String> set1 = new LinkedHashSet<>();
        set1.add("Donald");
        set1.add("Mickey");
        set1.add("Minnie");

        System.out.println("Before Reverse");
        System.out.printf("First Item: %s\n", set1.getFirst());
        System.out.printf("Last Item: %s", set1.getLast());
        System.out.println();
        System.out.println("After Reverse");
        SequencedSet<String> set12 = set1.reversed();
        System.out.println("set12.getFirst() = " + set12.getFirst());
        System.out.println("set12.getLast() = " + set12.getLast());
        System.out.println("set1.getFirst() = " + set1.getFirst());
        System.out.println("set1.getLast() = " + set1.getLast());

        System.out.printf("\nset1.iterator().next() = %s", set12.iterator().next());

    }
}
