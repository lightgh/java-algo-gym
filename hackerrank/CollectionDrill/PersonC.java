package CollectionDrill;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonC<methodName> {

    private String surname;
    private String name;

    public PersonC(String surname, String name){
        this.name = name;
        this.surname = surname;
    }

    public static void main(String[] args) {
        HashMap<PersonC, String> personCMap = new HashMap<>();
        PersonC personC1 = new PersonC("smith", "John");
        PersonC personC2 = new PersonC("smith", "John");
        personCMap.put(personC1, "person1");

        System.out.println(personC1);
        System.out.println(personC2);
        System.out.println(personCMap.get(personC2));

        PersonC nn = new PersonC("James", "Latino");

        String surnameVar = nn.surname;

        String personName = personC1.name;
        String personSurname = personC1.surname;

        String personC1Name = personC1.name;

        String anotherSurname = personC1.surname;

        System.out.println(personC1.surname);

        System.out.println("personC1.name = " + personC1.name);

        while (personC1.surname != "Cynthia") {

        }

        if (personC1.surname != null) {

        }

//        log.debug("ast");

        Integer integer = 89;

        List<Integer> numbers = Stream.of(1, 2, 3,3, 4, 5, 3, 9).collect(Collectors.toList());

        for (Integer number : numbers) {
            System.out.println(number);
        }

    }

    public Optional<String> getSurname() {
        return Optional.ofNullable(surname);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonC personC = (PersonC) o;
        return surname.equals(personC.surname) && name.equals(personC.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }
}


