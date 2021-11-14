package datastructures.streams.strmdrill;


import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsStream {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Peterson");
        listOfNames.add("Samson");
        listOfNames.add("Faith");
        listOfNames.add("James");

        List<String> namesContainingLetterA = listOfNames.stream()
                        .filter( e-> e.contains("a"))
                                .collect(Collectors.collectingAndThen(Collectors.toList(),
                                        Collections::unmodifiableList));


        System.out.println("List Of Names: " + listOfNames);

        List<String> unModifiableListOfNames = Collections.unmodifiableList(listOfNames);

        List<String> completelyUnmodifiableListOfNames = Collections.unmodifiableList(new ArrayList<>(listOfNames));

        System.out.println("List Of Unmodifiable Names: " + unModifiableListOfNames);

        System.out.println("List Of Unmodifiable Names-2: " + completelyUnmodifiableListOfNames);

//        unModifiableListOfNames.add("Kenneth");
//        completelyUnmodifiableListOfNames.add("Kingsley");

        //After modification:
        listOfNames.add("Othman");
        System.out.println("Modifiable: List Of Names: " + listOfNames);
        System.out.println("UnModifiable Names: " + unModifiableListOfNames);
        System.out.println("Unmodifiable Names-2: " + completelyUnmodifiableListOfNames);

        List<Employee> employeeDatabase = new ArrayList<>();
        employeeDatabase.add(new Employee(28, "Cynthia", "Bauchi", 4500));
        employeeDatabase.add(new Employee(45, "Andrew", "Abuja", 2000));
        employeeDatabase.add(new Employee(90, "Yohanna", "Jos", 5600));
        employeeDatabase.add(new Employee(77, "Linda", "Nassarawa", 9000));
        employeeDatabase.add(new Employee(29, "Ummi", "Gordon", 3400));
        employeeDatabase.add(new Employee(59, "Peace", "Gordon", 5400));
        employeeDatabase.add(new Employee(89, "Janet", "Nassarawa", 1200));
        employeeDatabase.add(new Employee(89, "Manet", "Nassarawa", 1200));

        Predicate<Employee> employeeBelow30yrs = employee -> employee.getAge() < 30;
        long noOfEmployeeBelow30 = employeeDatabase.stream()
                .filter(employeeBelow30yrs)
                .collect(Collectors.counting());

        System.out.printf("\nNo Of Employees Below 30: %d\n", noOfEmployeeBelow30);

        System.out.printf("No Of Employees Above 30: %d\n", employeeDatabase.stream()
                .filter(employeeBelow30yrs.negate())
                .collect(Collectors.counting()));

        int totalSalaryOfEmployeesLessThan30 = employeeDatabase.stream()
                .filter(employeeBelow30yrs)
                .collect(Collectors.summingInt(emp -> emp.getSalary()));

        System.out.printf("\nEmployees Salary Below 30yrs Sum: %d\n", totalSalaryOfEmployeesLessThan30 );

        System.out.printf("\nEmployees Salary Above 30yrs Sum: %f\n", employeeDatabase.stream()
                .filter(employeeBelow30yrs.negate())
                .collect(Collectors.summingDouble(emp -> emp.getSalary())));


        System.out.printf("\nAverage of Employees Salary Above 30yrs Sum: %f\n", employeeDatabase.stream()
                .filter(employeeBelow30yrs.negate())
                .collect(Collectors.averagingInt(emp -> emp.getSalary())));


        System.out.printf("\nAverage of Employees Salary Below 30yrs Sum: %f\n", employeeDatabase.stream()
                .filter(employeeBelow30yrs)
                .collect(Collectors.averagingDouble(emp -> emp.getSalary())));


        Optional<Employee> empByMinSalary = employeeDatabase.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

        Optional<Employee> empByMaxSalary = employeeDatabase.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

        System.out.printf("Employees Minimum Salary: %s\n", empByMinSalary.get().getName());

        System.out.printf("Employees Minimum Salary: %s\n", empByMinSalary);

        System.out.printf("Employees Max Salary: %s\n", empByMaxSalary.get().getName());

        System.out.printf("Employees Max Salary: %s\n", empByMaxSalary);

        IntSummaryStatistics summerizingInt = Stream.of("34", "56", "223", "900", "33", "92", "877")
                .collect(Collectors.summarizingInt(Integer::parseInt));

        String joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining());
        System.out.println(joinedString);

        joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining(" "));

        System.out.println(joinedString);

        joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining(" ", "prefix", "suffix"));

        System.out.println(joinedString);

        joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining(" ", "<===", "====>"));

        System.out.println(joinedString);

        Map<String, List<Employee>> employeeMap = employeeDatabase.stream()
                .collect(Collectors.groupingBy(Employee::getAddress));

        System.out.printf("\nGROUPING EMPLOYEE BY ADDRESS/COUNTRY \n%s\n",
                employeeMap);

        Map<String, Set<Employee>> employeeSet = employeeDatabase.stream()
                .collect(Collectors.groupingBy(Employee::getAddress, Collectors.toSet()));


        System.out.println(employeeSet);

        Map<String, Map<Integer, List<Employee>>> employeeMapMap = employeeDatabase.stream()
                .collect(Collectors.groupingBy(Employee::getAddress, Collectors.groupingBy(Employee::getAge)));


        System.out.println(employeeMapMap);

        Map<String, Set<Employee>> employeeMapSet = employeeDatabase.stream()
                .collect(Collectors.groupingBy(Employee::getAddress, HashMap::new, Collectors.toSet()));

        System.out.printf("EMP-MAP-SET: " + employeeMapSet);

        ConcurrentMap<String, List<Employee>> employeeMapConcurrent = employeeDatabase.parallelStream()
                .collect(Collectors.groupingByConcurrent(Employee::getAddress));

        System.out.println("\nEMP-MAP-CONCURRENT: \n" + employeeMapConcurrent);

        Predicate<Employee> employeeAbove30YrsPredicate = emp -> emp.getAge() > 30;
        Map<Boolean, List<Employee>> employeeMapPartition = employeeDatabase.stream()
                .collect(Collectors.partitioningBy(employeeAbove30YrsPredicate));

        System.out.println("EmployeeMapPartition");
        System.out.println(employeeMapPartition);



    }


    static class Employee{
        private int age;
        private String name;
        private String address;
        private int salary;

        public Employee(int age, String name, String address, int salary){
            this.age = age;
            this.name = name;
            this.address = address;
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
