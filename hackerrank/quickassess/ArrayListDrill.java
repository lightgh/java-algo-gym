package quickassess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDrill {
    public static void main(String[] args) {
        List<DrillEmployee> employeeList = new ArrayList<>();
        employeeList.add(new DrillEmployee("Simi", 45, "USA"));
        employeeList.add(new DrillEmployee("Jani", 90, "NG"));
        employeeList.add(new DrillEmployee("Samson", 78, "RUSSIA"));
        employeeList.add(new DrillEmployee("Hanna", 34, "JAMAICA"));

        List<DrillEmployee> drillEmployeeListAbove50Yrs = employeeList.stream().filter(e -> e.age > 56).collect(Collectors.toList());
        System.out.println("drillEmployeeListAbove50Yrs: " + drillEmployeeListAbove50Yrs);

        List<Integer> listL = new ArrayList<>();
        listL.add(5);
        listL.add(3);
        listL.add(1);

        listL.add(6);
        listL.add(0, 4);
//        listL.remove(1);
        System.out.println("listL = " + listL);

        int[] evenArray = {2, 4, 6, 8, 10};
        System.out.println("EVEN-ARRAY: " + Arrays.toString(evenArray));

        int[] nEvenArray = {23};
        System.out.println("New-AR: " + Arrays.toString(nEvenArray));

        nEvenArray = Arrays.copyOf(evenArray, evenArray.length);
        System.out.println("nEvenArray = " + Arrays.toString(nEvenArray));

    }
}

class DrillEmployee {
    String name;
    int age;
    String country;

    public DrillEmployee(String name, int age, String country) {
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "DrillEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
