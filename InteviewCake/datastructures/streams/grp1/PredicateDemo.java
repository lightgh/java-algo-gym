package datastructures.streams.grp1;

import java.util.function.Predicate;

public class PredicateDemo {
    static boolean isPersonEligibleVoting(Person person, Predicate<Person> predicate ){
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("Alex", 23, "Nigeria");

        Predicate<Person> predicate = p -> p.getAge() > 20;

        boolean eligiblity = isPersonEligibleVoting(person, predicate);

        System.out.println("Person is eligible for voting: " + eligiblity);

        Predicate<Person> andPredicate = predicate.and( (p) -> p.getAge() < 18 );

        Predicate<Person> andPredicate2 = predicate.and( (p) ->{
            return p.getAge() < 3;
        });

        Predicate<Person> andPredicate3 = predicate.and(new Predicate<Person> () {
            public boolean test(Person person1){
                return person1.getAge() > 23;
            }
        });

        Predicate withOrPredicate = andPredicate3.or( (p) -> p.getAge() < 67 );

        Predicate notWithOrPredicate = withOrPredicate.negate();

        notWithOrPredicate.test(person);

        Predicate wP2 = andPredicate3.or((p2) -> p2. )



    }
}
