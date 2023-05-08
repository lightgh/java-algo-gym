package codingDrills.streamdrill;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDrill {

    public static void main(String[] args) {
        List<String> originalList = List.of("Homer", "Marge", "Bart", "Maggie");

        List<String> newList = originalList.stream()
                .filter(e -> e.equals("Moe"))
//                .filter(h -> h.equals("Homer"))
                .collect(Collectors.toList());

        System.out.println(originalList);
        System.out.println(newList);

        String[] jA = "jkjk".split("");
        char[] jAc = "jkjk".toCharArray();
        Arrays.sort(jAc);
        Arrays.sort(jA);
        System.out.println("Char: " + (new String(jAc)));
        System.out.println("Str->Array->Stream->JoinedCharactersToString=> " + Arrays.stream(jA).collect(Collectors.joining()));

        System.out.println("JanitorPrinting");
        System.out.println("JanitorPrinting".length());
        System.out.println("JanitorPrinting".substring(7, 12).length());
        System.out.println("JanitorPrinting".substring(7, 12));

        String name = "SingerHouseFor";

        String sb11 = Character.toString(name.charAt(0));
        System.out.println("StringBuilder sb11==>:: " + sb11.toString());


    }
}
