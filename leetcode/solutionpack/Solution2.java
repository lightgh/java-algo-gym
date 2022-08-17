import java.util.List;
import java.util.Map;

public class Solution2 {


    private static final Map<Character, List<Character>> MAPPING = Map.ofEntries(
            Map.entry('1', List.of()),
            Map.entry('2', List.of('a', 'b', 'c')),
            Map.entry('3', List.of('d', 'e', 'f')),
            Map.entry('4', List.of('g', 'h', 'i')),
            Map.entry('5', List.of('j', 'k', 'l')),
            Map.entry('6', List.of('m', 'n', 'o')),
            Map.entry('7', List.of('p','q','r','s')),
            Map.entry('8', List.of('t', 'u', 'v')),
            Map.entry('9', List.of('w', 'x', 'y', 'z'))
    );

    private static final Map<String, List<Character>> MAPPING_STRING = Map.ofEntries(
            Map.entry("1", List.of()),
            Map.entry("2", List.of('a', 'b', 'c')),
            Map.entry("3", List.of('d', 'e', 'f')),
            Map.entry("4", List.of('g', 'h', 'i')),
            Map.entry("5", List.of('j', 'k', 'l')),
            Map.entry("6", List.of('m', 'n', 'o')),
            Map.entry("7", List.of('p', 'q', 'r', 's')),
            Map.entry("8", List.of('t', 'u', 'v')),
            Map.entry("9", List.of('')),


    )

    public static void main(String[] args) {
        System.out.println("Solution Running/Testing");




    }
}
