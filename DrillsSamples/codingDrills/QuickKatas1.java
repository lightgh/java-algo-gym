package codingDrills;

import optionaldrills.annotationdrill.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuickKatas1 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("rita", "peterson", "34"));
//        personList.get(0);
        Person person = personList.get(0);
        System.out.println(person);

        Map<String, Object> mapObj = new HashMap<>();


        System.out.println((String) mapObj.get("Cynthia"));

        personList.get(0);

        System.out.println("Using E-FOR LOOP for printing constants");
        for (Person person1 : personList) {
            System.out.println(person1);
        }

    }
}
