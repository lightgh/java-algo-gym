package datastructures.java8func;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1L, "Janet"));
        employeeList.add(new Employee(2L, "Janet"));

        employeeList.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
    }
}

class Employee {
    private String name;
    private Long id;

    public Employee(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}
