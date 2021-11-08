package datastructures.streams.strmdrill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDrillPrt1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("h");

        Stream<String> stream = list.stream();

//        stream.forEach(System.out::printf);
        stream.forEach(e -> System.out.printf("\t%s\n", e));

        List<List<String>> listOfList =  new ArrayList<>();

        listOfList.add(Arrays.asList("Like", "Song", "Peterson"));
        listOfList.add(Arrays.asList("BLike", "ASong", "APeterson"));
        listOfList.add(Arrays.asList("CLike", "BSong", "BPeterson"));

        System.out.println("Listing Songs");
        listOfList.stream()
                .flatMap(e -> e.stream())
                .filter(e -> e.contains("Song"))
                .forEach(System.out::println);


    }
}
