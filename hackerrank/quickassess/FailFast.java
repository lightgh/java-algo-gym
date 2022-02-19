package quickassess;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FailFast {
    public static void main(String[] args) {

        /*
        Fail-Fast Example
         */

        System.out.println("Fail-Fast Example");

        Map<String, String> cityCode = new HashMap<>();
        cityCode.put("Name", "Abuja");
        cityCode.put("ZipCode", "233334");
        cityCode.put("Longitude", "9384983483");
        cityCode.put("Latitude", "00234983483");

        Iterator<String> iterator = cityCode.keySet().iterator();

        while (iterator.hasNext()) {
            String nextKey = iterator.next();
            System.out.println(cityCode.get(nextKey));

            if (nextKey.equalsIgnoreCase("ZipCode") || nextKey.equalsIgnoreCase("Name"))
                iterator.remove();
        }

        System.out.println("Listing Remaining Contents: ");
        cityCode.forEach((k, v) -> System.out.println(v));

        List<String> nameList = new ArrayList<>();
        nameList.add("Simi");
        nameList.add("Esther");
        nameList.add("Peterson");
        nameList.add("Anderson");

        nameList.forEach(ea -> {
//            nameList.add("Kingson");
            System.out.println(ea);
//            nameList.remove(ea);
        });

        nameList.remove("Peterson");
        System.out.println("========Divider=======");

        nameList.forEach(eb -> {
            System.out.println(eb);
        });

        Iterator<String> stringIterator = nameList.iterator();
        stringIterator.forEachRemaining(eaR -> {
            System.out.println("eaR = " + eaR);
//            nameList.add("Naominh");
        });

        List<Integer> integerList = new CopyOnWriteArrayList<>();

        IntStream.rangeClosed(30, 50).forEach(e -> {
            integerList.add(e);
        });

        System.out.println("BEFORE:-WORKING-ON-IT: " + integerList);


        System.out.println("WHILE:-WORKING-ON-IT: ");

        integerList.forEach(eacV -> {
            if (eacV == 37 || eacV == 47) {
                System.out.println("Removing the Value: " + eacV);
                integerList.remove(eacV);
            }
            System.out.println(eacV);
        });

        System.out.println("After Removing the Elements: ");
        System.out.println("integerList = " + integerList);

        CopyOnWriteArrayList<String> copyOnWriteArrayList
                = new CopyOnWriteArrayList<>(nameList);
        System.out.println("copyOnWriteArrayList = " + copyOnWriteArrayList);

        Iterator<String> itr = copyOnWriteArrayList.iterator();

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }

        System.out.println("\"Creating a ConcurrentHashMap\" = " + "Creating a ConcurrentHashMap");
        ConcurrentHashMap<String, Integer> chMap = new ConcurrentHashMap<>();

        chMap.put("ONE", 1);
        chMap.put("TWO", 2);
        chMap.put("THREE", 3);
        chMap.put("FOUR", 4);

        Iterator<String> it = chMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + " : " + chMap.get(key));
            chMap.put("THREE-1", 90);
        }

        String sign = "";
        int num = 120;
        String numStr = "";
        if (num < 0) {
            sign = "-";
            numStr = String.valueOf((num * -1));
        } else {
            numStr = String.valueOf(num);
        }

        StringBuilder revStr = new StringBuilder();

        for (int i = numStr.length() - 1; i >= 0; i--
        ) {
            revStr.append(numStr.charAt(i));
        }
        if (revStr.charAt(0) == '0') {
            revStr.deleteCharAt(0);
        }

        System.out.println(sign + revStr.toString());

        List arList = new ArrayList();

        System.out.println("AR-LIST: " + arList);

        List ifsArList = new ArrayList(13);
        ifsArList.add(34);
        ifsArList.add(7);
        ifsArList.add(2);
        ifsArList.add(3);
        ifsArList.add(9);
        ifsArList.add("Singing");
        System.out.println("ifsArList = " + ifsArList);
        ifsArList.add(2, 99999);
        ifsArList.add(222299999);
        System.out.println("ifsArList-2 = " + ifsArList);

        List colInitArList = new ArrayList(ifsArList);
        colInitArList.add("Knight");
        System.out.println("colInitArList = " + colInitArList);

        colInitArList.remove(Integer.valueOf(99999));
        colInitArList.remove(3);
        System.out.println("colInitArList-Remove-2 = " + colInitArList);

        ArrayList<String> arListCol = new ArrayList<>(colInitArList);
        System.out.println("arListCol = " + arListCol);

        MyArList arl = new MyArList();
        arl.add("Sing");
        arl.add("Sing");
        arl.add("Sing");
        arl.add("And");
        arl.add("Make");
        arl.add("Music");
        arl.add("To");
        arl.add("The");
        arl.add("Heavens");

        System.out.println("arl = " + arl);
//        arl.removeRangeVal(0,3);
//        System.out.println("arl-Using RemoveRange = " + arl);

        arl.removeAll(Arrays.asList("Sing", "And", "Make", "The"));

        System.out.println("arl-afterCollectionAddition = " + arl);

        List<String> locationList = new ArrayList<>();
        locationList.add("Abuja");
        locationList.add("Gombe");
        locationList.add("Nassarawa");
        locationList.add("Bauchi");

        System.out.println("locationList-BeforeTransformation = " + locationList);

        locationList.replaceAll((el) -> el.toUpperCase());

        System.out.println("locationList-AfterTransformation = " + locationList);

        System.out.println("locationList-Bauchi-First = " + locationList.indexOf("BAUCHI"));
        System.out.println("locationList-Nassarawa-First = " + locationList.indexOf("NASSARAWA"));

        for (int i = 0; i < locationList.size(); i++) {
            System.out.println("=>| " + locationList.get(i));
        }

        System.out.println("<==EVAL<==>EVAL==>");
        for (String eVal : locationList) {
            System.out.println("EVAL: => " + eVal);
        }

        Iterator<String> eachItr = locationList.iterator();

        System.out.println("Using-Iterator-Next");
        while (eachItr.hasNext()) {
            String nextItem = eachItr.next();

            System.out.println("eachItr.next() = " + nextItem);

            if (nextItem.equalsIgnoreCase("ABUJA") || nextItem.equalsIgnoreCase("BAUCHI")) {
                eachItr.remove();
            }
        }

        System.out.println("Iterating using forEachRemaining() method");
        Iterator<String> newItr = locationList.iterator();
        newItr.forEachRemaining(each -> System.out.println(each));

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(89);
        listInteger.add(99);
        listInteger.add(109);
        listInteger.add(39);

        Iterator<Integer> iterator1 = listInteger.iterator();
//
//        listInteger.add(566);

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("\"Using List Iterators\" = " + "Using List Iterators");
        ListIterator<Integer> integerListIterator = listInteger.listIterator();


        int countLo = 0;

        while (integerListIterator.hasNext()) {
            Integer nextInt = integerListIterator.next();
            System.out.println("nextInt = " + nextInt);

            if (nextInt == 109) {
                while (integerListIterator.hasPrevious() && countLo != 3) {
                    Integer previous = integerListIterator.previous();
                    System.out.println("previous-Int = " + previous);
                    if (previous == 89) {
                        countLo++;
                        break;
                    }
                }
            }
        }

        System.out.println("Forward Direction Iteration:");
        while (integerListIterator.hasNext()) {
            Integer nextIntVar = integerListIterator.next();
            System.out.println("nextIntVar = " + nextIntVar);
        }

        System.out.println("Backward Direction Iteration:");
        while (integerListIterator.hasPrevious()) {
            Integer pervInt = integerListIterator.previous();
            System.out.println("pervInt = " + pervInt);
        }


        List listA = new ArrayList();

        listA.add(23);
        listA.add(45);
        listA.add(89);
        listA.add("Simon");
        listA.add(integerList);

        processListElement(listA);

        Iterator rawIterator = listA.iterator();

        while (rawIterator.hasNext()) {
            Object itNextVar = rawIterator.next();
            processListItem(itNextVar);
        }

        System.out.println("Custom-Obj Employee Sorting And Listing");
        listDisplayEmployee();


    }

    private static void processListItem(Object itNextVar) {
        if (itNextVar instanceof List) {
            List itNextVarList = (List) itNextVar;
            Collections.sort(itNextVarList, Collections.reverseOrder());
            System.out.println("rawIterator.next() = " + itNextVar);
            System.out.println("rawIterator.next()-SL = " + itNextVarList);
            Object sortedList = itNextVarList.stream()
                    .sorted(Collections.reverseOrder())
                    .collect(Collectors.toList());
            System.out.println(sortedList);
        }
    }

    public static void processListElement(List list) {
        IntStream.rangeClosed(45, 90).forEach(eaV -> {
            list.add(eaV);
        });
    }

    public static void  listDisplayEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Umi", 34));
        employeeList.add(new Employee("Jessy", 45));
        employeeList.add(new Employee("Janet", 78));
        employeeList.add(new Employee("Jhen", 89));

        Collections.sort(employeeList);

        Collections.sort(employeeList, new EmployeeNameComparator());
        System.out.println("Order By Employee Name: " + employeeList);

        Collections.sort(employeeList, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        Collections.sort(employeeList, new EmployeeAgeComparator());
        Collections.sort(employeeList, (o1, o2) -> o1.age - o2.age);
        Collections.sort(employeeList, Comparator.comparingInt(o -> o.age));
        System.out.println("Order By Employee Age: " + employeeList);

    }
}

class MyArList extends ArrayList<String> {
    public void removeRangeVal(int startIndex, int stopIndex) {
        this.removeRange(startIndex, stopIndex);
    }
}

class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age){
        super();
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Employee emp) {
        return this.name.compareTo(emp.name);
    }

    public String toString(){
        return "[" + this.name + ", " + this.age + "]";
    }
}

class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
      return o1.age - o2.age;
    }
}

class EmployeeNameComparator implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2){
        return o1.name.compareTo(o2.name);
    }
}


