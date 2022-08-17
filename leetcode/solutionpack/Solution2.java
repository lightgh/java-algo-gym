package solutionpack;

import java.util.ArrayList;
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
            Map.entry('7', List.of('p', 'q', 'r', 's')),
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
            Map.entry("9", List.of('w', 'x', 'y', 'z'))
    );

    private List<String> result = null;

    public List<String> letterCombinations(String digits) {
        if (null != digits && !digits.isEmpty()) {
            result = new ArrayList<>();
            compute(digits, 0, new StringBuilder());
            return result;
        } else {
            return List.of();
        }
    }

    /***
     *
     * // 23
     *  =>(2, 3)
     *  2 => a,b,c
     *  3 => d,e,f
     *
     *
     *
     * @param digits
     * @param i
     * @param stringBuilder
     */
    private void compute(String digits, int index, StringBuilder stringBuilder) {

        if (index == digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        MAPPING.get(digits.charAt(index)).stream().forEach(value -> {
            stringBuilder.append(value);
            compute(digits, index + 1, stringBuilder);
            stringBuilder.setLength(stringBuilder.length() - 1);
        });

    }

    public static Map<Character, List<Character>> MAP_REPRESENTATION = Map.ofEntries();

    public static Map<Integer, List<Character>> MAP_REPRESENTATION_1 = Map.of(Integer.valueOf("1"), List.of('A', 'B'), Integer.valueOf("3"), List.of('C'));

    public static void main(String[] args) {

        System.out.println("Solution Running/Testing");

        System.out.println("MAPPING = " + MAPPING);
        System.out.println("MAPPING_STRING = " + MAPPING_STRING);

        Solution2 solution2 = new Solution2();
        List<String> outcome = solution2.letterCombinations("238983");

        System.out.println("outcome = " + outcome);
    }
}
