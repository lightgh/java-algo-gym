package datastructures.streams.grp1;

import java.util.function.*;

public class PredicateDemo {
    static boolean isPersonEligibleVoting(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("Alex", 23, "Nigeria");

        Predicate<Person> predicate = p -> p.getAge() > 20;

        boolean eligiblity = isPersonEligibleVoting(person, predicate);

        System.out.println("Person is eligible for voting: " + eligiblity);

        Predicate<Person> andPredicate = predicate.and((p) -> p.getAge() < 18);

        Predicate<Person> andPredicate2 = predicate.and((p) -> {
            return p.getAge() < 3;
        });

        Predicate<Person> andPredicate3 = predicate.and(new Predicate<Person>() {
            public boolean test(Person person1) {
                return person1.getAge() > 23;
            }
        });

        Predicate withOrPredicate = andPredicate3.or((p) -> p.getAge() < 67);

        Predicate notWithOrPredicate = withOrPredicate.negate();

        notWithOrPredicate.test(person);

        Predicate wP2 = andPredicate3.or((p2) -> p2.getAge() > 6)
                .and((c2) -> c2.getAge() < 4)
                .or((c3) -> c3.getName().length() < 34)
                .or((c4) -> c4.getCountry().equalsIgnoreCase("Nigeria"))
                .or(((c5) -> c5.getName().isEmpty()));

        Predicate isEqualPredicate = Predicate.isEqual(person);

        System.out.println("OUTCOME: " + isEqualPredicate.test(person));

        BiPredicate<Person, Person> biPredicate = (p, p1) -> (p.getName().equalsIgnoreCase(p1.getName()));
        biPredicate.test(person, person);

        BiPredicate<Person, Person> personBiPredicate = biPredicate.and((p2, p3) -> p2.getAge() < p3.getAge())
                .or((p2, p3) -> p2.getAge() < 30)
                .and((p2, p3) -> p2.getCountry().equalsIgnoreCase("Nigeria"))
                .or((p3, p4) -> p3.getName().contains("jane"));

        Person nPerson = new Person("Jessy", 20, "Nigeria");

        System.out.println("Is Person Eligible For Voting: " + isPersonEligibleForVoting(nPerson, 18,
                (p2, minAge) -> p2.getAge() >= minAge));

        System.out.println("Is Another Person Eligible Voting: " +
                isPersonEligibleForVoting(nPerson, 20, (p2, mAge) -> {
                    return p2.getAge() >= mAge;
                }));

        boolean eligible =
                isPersonEligibleForVoting(
                        nPerson,
                        30,
                        (p2, mA) -> {
                            return p2.getAge() >= mA;
                        }
                );

        System.out.println("Another Eligibility Test: " + eligible);

        LongPredicate greaterThan89 = (p) -> p > 89;
        IntPredicate greaterThan20 = (p) -> p > 20;
        DoublePredicate greaterThan30 = (p) -> p > 30;

        greaterThan20
                .and(greaterThan20)
                .or((p) -> p > 2);

        greaterThan89
                .and((i) -> i < 50);


    }

    static boolean isPersonEligibleForVoting(Person person, Integer minAge, BiPredicate<Person, Integer> predicate) {
        return predicate.test(person, minAge);
    }
}
