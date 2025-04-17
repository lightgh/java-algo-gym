package educative;

import java.util.HashMap;

public class NonRepeating {
    public static void main(String[] args) {
        String str="stress"; //find 1st non-repeating char in string?
        System.out.printf("%s is the first non-repeating character in %s", nonRepeating(str), str);
    }

    public static char nonRepeating(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar,0) + 1);
        }

        for(char c : str.toCharArray()) {
            if(charCountMap.get(c) == 1){
                return c;
            }
        }
        return ' ';
    }
}
