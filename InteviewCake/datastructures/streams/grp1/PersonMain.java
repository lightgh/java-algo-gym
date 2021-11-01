package datastructures.streams.grp1;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Josh", 22, "USA"));
        persons.add(new Person("Carl", 23, "Australia"));
        persons.add(new Person("Admit", 23, "India"));
        persons.add(new Person("Vikram", 24, "Bhutan"));
        persons.add(new Person("Kane", 24, "Brazil"));

        List<Person> sortedPersons = PersonService.getPersons(persons);

        List<Person> secondSortedPersons = PersonService.getSortedPersonsV2(persons);

        System.out.println("SORTED-PERSONS");
        for(Person person : sortedPersons){
            System.out.println("Person Name : " + person.getName());
        }

        System.out.println("SECOND-SORTED-PERSONS");
        for (Person person : secondSortedPersons){
            System.out.println("Person Name: " + person.getName());
        }
    }
}
