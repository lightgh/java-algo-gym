package javaocpjpprep.lambdadril;

public class GroupOfLambdaDrill {
    public static void main(String[] args) {
        System.out.println("GroupOfLambdaDrill");
        SampLambdaInterface sampLambdaInterface = () -> System.out.println("Learning Continues - Using Samp");
        sampLambdaInterface.greet();
        trySampLambMethod(() -> System.out.println("PassedPrinting func"));
        trySampLambMethod(sampLambdaInterface);
        OneInterfaceDrill oneInterfaceDrill = () -> {
            System.out.println("Ran when deliver method is called upon");
        };

        oneInterfaceDrill.callOther(() -> {
            System.out.printf("Ran-2 when deliver method is called upon");
        });
        String v = "90";
        v.split("");
        Integer c = Integer.parseInt(""+v.charAt(0));
        System.out.println("\nCHAR: " + c);
        Integer c1 = Integer.parseInt(""+v.charAt(1));
        System.out.println("CHAR: " + c1);
        oneInterfaceDrill.callMe();
        oneInterfaceDrill.deliver();
        oneInterfaceDrill.send();
    }

    public static void trySampLambMethod(SampLambdaInterface samp){
        System.out.println("From-trySampLambMethod-Calling Samp: ");
        samp.greet();
    }
}

@FunctionalInterface
interface SampLambdaInterface {
    void greet();
}

@FunctionalInterface
interface SingRockInterface {
    void sing();
}

@FunctionalInterface
interface DanceRockInterface {
    void dance();
}

interface CookFoodInterface {
    void cook();
    void prepare();
}

@FunctionalInterface
interface SpecialCookInterface {
    void prepare();
    default String delegate(){
        return "delegate method";
    }
}

@FunctionalInterface
interface OneInterfaceDrill {
    default void callMe(){
        System.out.println("CALL ME Method");
    }

    void deliver();
    default void send(){
        System.out.println("Send Method");
    }

    default void callOther(OneInterfaceDrill oneInterfaceDrill){
        oneInterfaceDrill.deliver();
    }
}

