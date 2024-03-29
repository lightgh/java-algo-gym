package quickassess;

import java.util.*;

public class HashMapDrill {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56);
        System.out.println("stockPrice = " + stockPrice);

        stockPrice.put("Oracle", 60);
        System.out.println("stockPrice = " + stockPrice);

        stockPrice.putIfAbsent("Oracle", 70);
        System.out.println("stockPrice = " + stockPrice);

        stockPrice.computeIfPresent("Oracle", (val, j) -> {
            return j * 45;
        });

        System.out.println("stockPrice = " + stockPrice);

        stockPrice.put("Fiserv", 123);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        System.out.println("stockPrice.get(\"Oracle\") = " + stockPrice.get("Oracle"));
        System.out.println("stockPrice.get(\"Google\") = " + stockPrice.get("Google"));

        // Since Google is not present in our Map, this will insert it with default value of 100.
        System.out.println("stockPrice.getOrDefault(\"Google\", 100) = " + stockPrice.getOrDefault("Google", 100));

        boolean isBmwValueReplaced = stockPrice.replace("BMW", 90, 67);
        System.out.println("isBmwValueReplaced = " + isBmwValueReplaced);
        System.out.println("stockPrice-Updated = " + stockPrice);

        boolean isBmwValueNowReplaced = stockPrice.replace("BMW", 73, 67);
        System.out.println("isBmwValueNowReplaced = " + isBmwValueNowReplaced);
        System.out.println("stockPrice-Updated = " + stockPrice);

        Integer bmwNewValueReplacement = stockPrice.replace("BMW", 890);
        System.out.println("bmwNewValueReplacement = " + bmwNewValueReplacement);

        Integer mod_BmwValueReplacement = stockPrice.replace("MOD-BMW", 845);
        System.out.println("mod_BmwValueReplacement = " + mod_BmwValueReplacement);

        System.out.println("stockPriceModBmwValueRep = " + stockPrice);

        stockPrice.replaceAll((k, v) -> {
            return v + 300;
        });

        System.out.println("stockPriceKV = " + stockPrice);

        System.out.println("stockPrice.remove(\"Google\") = " + stockPrice.remove("Google"));

        System.out.println("stockPrice.remove(\"Oracle\") = " + stockPrice.remove("Oracle"));

        System.out.println("stockPrice.remove(\"BMW\", 45) = " + stockPrice.remove("BMW", 45));
        System.out.println("stockPrice.remove(\"BMW\", 1190) = " + stockPrice.remove("BMW", 1190));

        System.out.println("stockPrice.containsKey(\"BMW\") = " + stockPrice.containsKey("BMW"));
        System.out.println("stockPrice.containsValue(513) = " + stockPrice.containsValue(513));

        System.out.println("HashMap Keys");
        Set<String> stockPriceHMKeys = stockPrice.keySet();
        for (String key : stockPriceHMKeys) {
            System.out.println("key = " + key);
        }

        Collection<Integer> stockPriceHMValues = stockPrice.values();
        for (Integer value : stockPriceHMValues) {
            System.out.println("value = " + value);
        }

        System.out.println("stockPrice.isEmpty() = " + stockPrice.isEmpty());

        Set<String> stockPKeys = stockPrice.keySet();

        /*Object[] stockKeyobjects = stockPKeys.toArray();

        for (Object stockKeyobject : stockKeyobjects) {
            stockPrice.remove(stockKeyobject);
        }

        for (String stockPKey : stockPKeys) {
            stockPrice.remove(stockPKey);
        }
*/

        stockPrice.clear();


        System.out.println("stockPrice.isEmpty() = " + stockPrice.isEmpty());

        EmpPeople empP1 = new EmpPeople("Cynthia", 4500);
        EmpPeople empP2 = new EmpPeople("Rejoice", 4500);

        Map<EmpPeople, Integer> empPeopleIntegerMap = new HashMap<>();
        empPeopleIntegerMap.put(empP1, 6700);
        empPeopleIntegerMap.put(empP2, 7000);

        empP1.name = "Anderson";

        System.out.println("empPeopleIntegerMap.get(empP1) = " + empPeopleIntegerMap.get(empP1));
        System.out.println("empPeopleIntegerMap.get(empP2) = " + empPeopleIntegerMap.get(empP2));

        System.out.println("sample text in java");
        System.out.println("\"sample text in java\".indexOf(\"va\") = " + "sample text in java".indexOf("s"));



    }
}

class EmpPeople {
    String name;
    int empId;

    public EmpPeople(String empName, int empId ){
        this.empId = empId;
        this.name = empName;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    /**
     * the Fields used in calculating hascode should be immutable or the class should be immutable
     * if you intent using an object as hashMap key.
     * Overriding hashCode and equals is important
     * @return
     */
    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = prime * result + empId;
        result = prime * result + (name == null? 0 : name.hashCode());
        return result;
    }

    public boolean equals(Object obj){
        EmpPeople emp = (EmpPeople) obj;
        return (emp.empId == this.empId);
    }
}
