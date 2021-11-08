package datastructures.streams.strmdrill;

import java.util.Map;
import java.util.HashMap;


public class OptionalDrill {
    public static void main(String[] args) {
        StreamDemo streamDemo = new StreamDemo();
        Employee emp = streamDemo.getEmployee(123);
        Employee emp2 = streamDemo.getEmployee(126);
        System.out.println("EMP=> " + emp);
        System.out.println("EMP=> " + emp2);

        System.out.println("Emp-Name=> " + emp.getName());
    }
}

class StreamDemo {
    Map<Integer, Employee> empMap = new HashMap<>();

    public Employee getEmployee(Integer employeId){
        return empMap.get(employeId);
    }
}

class Employee{
    String name;
    int age;
    int salary;

    Employee(String name){
        this.name = name;
    }

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getSalary(){
        return this.salary;
    }


}
