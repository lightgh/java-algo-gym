package optionaldrills;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface InterfaceUsageSample {

    String processInput(String input);

    default void readInput(){
        System.out.println("Inside readInput");
        readInputStep1();
        readInputStep2();
    }

    private void readInputStep1(){
        System.out.println("Inside readInputStep1");
    }
    private void readInputStep2(){
        System.out.println("Inside readInputStep2");
    }

    default void readInput1(){
        System.out.println("Inside readInput1");
    }

    static void seekMe(){
        Arrays.asList();

        StringBuilder sb = new StringBuilder();
        sb.append("SeekMe");

        System.out.println(sb);

    }

}
