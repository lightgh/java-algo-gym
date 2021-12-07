package CollectionDrill;

import java.util.HashMap;
import java.util.Objects;

public class PersonC {

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
