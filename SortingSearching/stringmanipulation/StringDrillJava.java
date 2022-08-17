package stringmanipulation;

import java.util.Arrays;

public class StringDrillJava {

    public static void main(String[] args) {

        String[] stringArray = {
                "Learning Never Ends",
                "Singing Never Ends",
                "Ainging Never Ends",
                "Painting Continously Ends",
                "Handerson Print"
        };

        System.out.println(Arrays.toString(stringArray));

        for(String eachA : stringArray){
            System.out.println(Arrays.toString(eachA.split("", 5)));
        }


    }
}
