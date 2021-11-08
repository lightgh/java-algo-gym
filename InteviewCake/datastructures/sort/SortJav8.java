package datastructures.sort;

import datastructures.streams.grp1.Person;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.*;

public class SortJav8 {

    static int i = 89;

    public static void main(String[] args) {
        int[] firstA = {3, 4, 5, 6, 9};
        int[] firstB = {5, 9, 10, 16, 19};

        DoubleFunction<String> dblFunc1 = (h) -> (h * 34) + " Added";
        String doubleFunc1Outcome = dblFunc1.apply(4500.0);
        System.out.println("DoubleFunc1Outcome: " + doubleFunc1Outcome);

        Consumer<String> stringConsumer = (s) -> System.out.println("String Consumned: " + s);
        stringConsumer.accept("Janitor String Text");

        LongConsumer longConsumer = (s) -> {
            System.out.println(s * 90);
            System.out.println("Long Consumer: " + (s * 90));
        };

        longConsumer.accept(56);

        IntConsumer intConsumer = (in) -> {
            System.out.println("i clearly am having: " + in);
        };
        intConsumer.accept(5690);

        BiFunction<String, String, String> multiplyLengthFunction = (x, y) ->
                x.length() * y.length() + "";

        BiFunction<String, String, String> addLengthNumbersFunction = ( x, y) ->
                x.length() + y.length() + "";

        String outcome = addLengthNumbersFunction.apply("Singing", "Bird" );
        System.out.println("addLengthNumbersFunction: " + outcome);

        Function<String, String> funAddTwoString = (s) -> s + " <==> " + s;

        System.out.println(funAddTwoString.apply("Fun-Input-String"));

        String finalMLFOutcome = multiplyLengthFunction.andThen(funAddTwoString)
                .apply("Learning", "Conquering");

        System.out.println("finalMLFOutcome: " + finalMLFOutcome);

        System.out.println("=============================================");

        Function<Integer, Person> idPerson = (p) -> new Person("Santa", p++, "Nigeria");
        Function<Integer, Person> idPerson4 = (p) -> new Person("Santa", p+90, "Nigeria");

        Person outcomePerson = idPerson.apply(45);
        System.out.println("IdPerson: " + outcomePerson.toString());
        Function<Person, Person> id2Person = (p) -> { p.setAge(p.getAge() + 10); return p; } ;

        Person finAns = idPerson.andThen(id2Person).apply(67);
        System.out.println("FinAns: " + finAns);

        Person finAns2 = id2Person.compose(idPerson4).apply(78);
        System.out.println("FinAns2: " + finAns2);

        UnaryOperator<Person> unaryOperator1 = (p) -> {
            p.setAge(p.getAge() + 10);
            return p;
        };

        System.out.printf("UnaryOperator1-Person " + unaryOperator1.apply(new Person("Cynthia", 8, "Jos")));
        LongUnaryOperator longUnaryOperator = (g) -> g * (new Random().nextLong());

        System.out.println("LongUnaryOperator: " + longUnaryOperator.applyAsLong(90));

        Person fP = new Person("Ibrahim", 4, "Nigeria");
        Person sP = new Person("Simon", 5, "Algeria");

        System.out.printf("\nPerson Listing First: \n\t%s\n\t%s\n", fP, sP);
        BinaryOperator<Person> personBinaryOperator = (p1, p2) -> {
            p1.setAge(p2.getAge());
            p1.setCountry(p2.getCountry());
            return p1;
        };

        System.out.printf( "PersonalBinaryOperator: \n\t%s", personBinaryOperator.apply(fP, sP) );

        BooleanSupplier boolSup = () -> 78 > 90;

        System.out.printf("\nboolSup: %b", boolSup.getAsBoolean());

        BooleanSupplier isNotLeapYearBoolSup = () ->{
            return !LocalDate.now().isLeapYear();
        };


        System.out.println("BooleanSup: " +  isNotLeapYearBoolSup.getAsBoolean() ) ;



        BooleanSupplier isNumberEven = () -> i % 2 == 0;

        i = 100;

        System.out.println("isNumberEven: " + isNumberEven.getAsBoolean());

        i = 900;
    }
}