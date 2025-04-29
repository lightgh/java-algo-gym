package topicwise.classes;

import java.util.concurrent.Executors;

public sealed interface SealedInterfaces permits Morning {
}

non-sealed class Morning implements SealedInterfaces {
}

sealed interface TimeOfDay permits MorningNs, Afternoon, Evening {
    boolean early();
}

non-sealed class MorningNs implements TimeOfDay{
    public boolean early() {
        return true;
    }
}
non-sealed class Afternoon implements TimeOfDay{
    public boolean early() {
        return false;
    }
}

record Evening(int hour) implements TimeOfDay {
    @Override
    public boolean early() {
        return false;
    }
}

record BBQ(String type) implements Comparable<BBQ> {

    @Override
    public int compareTo(BBQ o) {
        return this.type.compareTo(o.type);
    }

    public static void main(String[] args) {
        BBQ bbq = new BBQ("a");
        BBQ bbq2 = new BBQ("b");
        System.out.println("bbq2.compareTo(bbq) = " + bbq2.compareTo(bbq));
    }
}

sealed class TestSealed {

    non-sealed class subASealed extends TestSealed {

    }

    final class finAClass extends subASealed {

    }

    sealed class sealBClass extends TestSealed {

    }

    final class finBClass extends sealBClass {

    }

    sealed interface intA {

    }

    final class finCClass implements intA {

    }

    public static void main(String[] args) {
        Object num = 34d;
        if(num instanceof Integer) {
            Integer numInt = (Integer) num;
            System.out.println("numInt = " + numInt);
        }

        if(num instanceof Double){
            Double numAsDouble = (Double) num;
            System.out.println("numAsDouble = " + numAsDouble);
        }

        if(num instanceof Float numAsFloat){
            System.out.println("numAsFloat = " + numAsFloat);
        }

        if(num instanceof Double d2 && d2.intValue() % 2 == 0){
            System.out.println("d2.intValue() = " + d2.intValue());
        }

        if(num instanceof Double d3 && d3.intValue() % 2 == 0) {
            System.out.println("d3.intValue() = " + d3.intValue());
        }

//        if(num instanceof Double d3 || d3.intValue() % 2 == 0) {      // wont compile because it is using OR
//            System.out.println("d3.intValue() = " + d3.intValue());
//        }
        if(num instanceof Double d31 ){
            System.out.println("d31.intValue() = " + d31.intValue());
        }

        if(num instanceof Double d4)
            System.out.println("d4.intValue() = " + d4.intValue());


        if(!(num instanceof Double df5 )){
            return;
        }
        System.out.println("df5.intValue() = " + df5.intValue());

        System.out.println("TestSealed.main - DVAL5 " + df5);

        if((num instanceof Double d)){

            System.out.println("TestSealed.main - DVAL6 " + d);
        }


        if(num instanceof Double d){
            System.out.println("TestSealed.main - DVAL7 " + d);
        }

        if(num instanceof Double numAsDouble){
            numAsDouble = 45.0;
            System.out.println("numAsInt = " + numAsDouble);
        }

        // It does not compile
//        Integer numTDouble = 123 ;
//        if(num instanceof Double numTDouble) {
//            System.out.println("numTDouble = " + numTDouble);
//        }

        String store = "Hallmark";
        store = "H&r";
        store = "null";
        switch(store){
            case "Hallmark" -> System.out.println("KC");
            case "Crayola", "H&R" -> System.out.println("PA");
            default -> System.out.println("anywhere");
        }

        Object obj = 12;
        String outcome =
        switch(obj){
            case null -> "";
            case Integer i when i > 21 -> "can gamble";
            case Integer i -> "too young to gamble";
            case String s when "poker".equals(s) -> "table game";
            case String s -> "other game";
            default -> throw new IllegalArgumentException("unexpected type");
        };

        System.out.println("outcome = " + outcome);



    }

}

class SampClass {
    enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    String symbol(Suit suit){
        return switch(suit) {
            case HEARTS -> "H";
            case DIAMONDS -> "D";
            case CLUBS -> "C";
            case SPADES -> "S";
        };
    }

    boolean idCheck(Integer age){
        boolean check;
        switch(age){
//            case Integer i when i <= 21 : check = true;
            case Integer i when i <= 40 : check = true; break;
            default: check = false;
        }
        return check;
    }

    public static void main(String[] args) {
        SampClass obj = new SampClass();
        System.out.println("obj.idCheck(19) = " + obj.idCheck(19));

        Executors.newVirtualThreadPerTaskExecutor().execute(() -> {
            System.out.println("obj.idCheck(19) = " + obj.idCheck(19));
        });

        Thread.ofVirtual();
        
        try(var service = Executors.newVirtualThreadPerTaskExecutor()) {
            service.submit(() -> doStuff());
        }

        doStuff();
    }

    /**
    * {@snippet :
     *  if (v.isPresent()){
    *  System.out.println("v: " + v.get());
    * }
     * }
     *
     * {@snippet file="ShowOptional.java" region="example"}
    *
    */
    private static void doStuff() {
        System.out.println("doStuff printout");
    }
}


sealed class Phone {
        non-sealed class IPhone extends Phone {
        }

        non-sealed class Android extends Phone {
        }
}