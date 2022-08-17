import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class JavaCodingDrill {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ami");
        Employee emp2 = new Employee(2, "Keki");
        Employee emp3 = new Employee(93, "Hana" );
        Employee emp4 = new Employee(94, "Han" );

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        List<Employee> employeesStartingWithK = employeeList.stream()
                .filter(e -> e.getName().toLowerCase().startsWith("k"))
                        .collect(Collectors.toList());
        employeesStartingWithK.stream().forEach(System.out::println);
        employeesStartingWithK.stream().map(e -> e.getName().length()).forEach(System.out::println);

        System.out.println("No Of Instances: " + Employee.employeeCount);

        EmployeeAgeCalculator employeeAgeCalculator = new EmployeeAgeCalculator();
        employeeAgeCalculator.additionalMethod();

        getAgeCalculator((e) ->  {
            return 8;
        });

    }

    public static int getAgeCalculator(EmployeeAge em){
        return em.additionalMethod();
    }

}

class EmployeeAgeCalculator implements EmployeeAge {
    @Override
    public int calculateAge(int year) {
        return 0;
    }

    @Override
    public int additionalMethod() {
        return EmployeeAge.super.additionalMethod();
    }
}

@FunctionalInterface
interface EmployeeAge {
    int calculateAge(int year); // abstract method

    default int additionalMethod(){
        return 9;
    }
}




class Employee {
    private String name;
    private int id;

    static int employeeCount = 0;

    public Employee(int id, String name){
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}