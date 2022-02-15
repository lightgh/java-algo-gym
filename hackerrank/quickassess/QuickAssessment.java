package quickassess;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class QuickAssessment {

    /*
    1. How does oauth work ?
    2. Explain the collections you know
    3. list,set,map, when do you use them
    4. what is serialization
    5. how do you declare a variable if you don't want to serialize
    6. Given a list with an object in it (employee name and id)
    7. how do you sort it based on employee name.
     */

    // HOW OAUTH WORKS:
    /*
     1. OAuth is an authentication protocol that allows you to approve one application interacting with another on your behalf without giving away your password.
     OAuth doesn't share password data but instead uses authorization tokens to prove an identity between consumers and service providers.

     2. Collections such as
        - Arraylist:
        - LinkedList:
        - Sets - HashSet, TreeSet,
        - HashMap, TreeMap, LinkedHashMap, ConcurrentHashmap

        ArrayList is a dynamic array that uses arrays implemented internally
        LinkedList
    */

    public transient int evenNumbers;

    public static void main(String[] args) {

        Set<Integer> numValSet = new HashSet<>();

        numValSet.add(89);
        numValSet.add(899);
        numValSet.add(891);
        numValSet.add(189);

        System.out.println("numValSet = " + numValSet);

        int startInclusive = 300;
        int endExclusive = 401;
        IntStream.range(startInclusive, endExclusive).forEach(eav -> {
            numValSet.add(eav);
        });

        System.out.println("numValSet-After-Mod = " + numValSet);
        System.out.println("numValSet.size() = " + numValSet.size());

        IntStream.rangeClosed(300, 401).forEach(eacV -> {
            numValSet.add(eacV);
        });

        System.out.println("numValSet-After-Mod-EndInclusive = " + numValSet);
        System.out.println("numValSet.size() = " + numValSet.size());

        Map<String, Integer> strValMap = new HashMap<>();
        strValMap.put("One", 1);
        strValMap.put("TWO", 2);
        strValMap.put("THREE", 3);
        strValMap.put("FOUR", 4);
        strValMap.put("FIVE", 5);
        strValMap.put("SIX", 6);
        strValMap.put("SEVEN", 7);
        strValMap.put("EIGHT", 8);
        strValMap.put("NINE", 9);
        strValMap.put("TEN", 10);

        System.out.println("strValMap = " + strValMap);
        System.out.println("strValMap.size() = " + strValMap.size());

    }

}

