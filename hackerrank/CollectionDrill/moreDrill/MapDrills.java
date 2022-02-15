package CollectionDrill.moreDrill;

import java.util.*;
import java.util.stream.Collectors;

public class MapDrills {

    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.addAll(Arrays.asList(1, 5, 7, 6, 5, 8, 5, 8));
        List<Integer> outCome = takeIntegers(randomNumbers);
        outCome.stream().forEach(e -> System.out.print(e + ", "));

    }

    public static  List<Integer> takeIntegers(List<Integer> randomIntegers){

        Map<Integer, Integer> numIntegers = new LinkedHashMap<>();
        Iterator<Integer> integerIterator = randomIntegers.iterator();


        while(integerIterator.hasNext()){
            Integer tmpInteger = integerIterator.next();

            if(numIntegers.containsKey(tmpInteger)){
                numIntegers.put(tmpInteger, numIntegers.get(tmpInteger) + 1 );
            }else{
                numIntegers.put(tmpInteger, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(numIntegers.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        List<Integer> finalAL = new ArrayList<>();

        list.forEach( k -> {
            for( int i = 0; i < k.getValue(); i++ ){
//                System.out.print(k.getKey() + ", ");
                finalAL.add(k.getKey());
            }
//            System.out.println(k);
        });

        return finalAL;

//        return numIntegers.entrySet().stream().fl.map((k, v)).collect(Collectors.toList());
    }

    public static void testMapDrill(){
        System.out.println("\nFrom: testMapDrill");
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 1020);
        map.put(3, 400);
        map.put(1, 340);
        map.put(5, 500);

//        map.forEach((k, v) -> System.out.println(k + "=" + v));

        System.out.println("After Sorting");
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        list.forEach(System.out::println);

        list.forEach( k -> {
            for( int i = 0; i <= k.getValue(); i++ ){
                System.out.print(k.getKey() + ", ");
            }
        });
    }


}
