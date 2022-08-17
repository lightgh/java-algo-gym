package multithreading;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demonstration {

    public static void main(String[] args) throws ParseException {

        SumUpExample sumUpExample = new SumUpExample(0, Integer.MAX_VALUE/2);
        sumUpExample.add();

        System.out.println("sumUpExample.counter = " + sumUpExample.counter);

        String string1 =  "12112022";

        System.out.println("STRING1-SUBSTRING: " + string1.substring(4, 8)) ;
        System.out.println("STRING1-SUBSTRING: " + string1.substring(0, 4)) ;


        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyymmdd");
        Date date = sdf1.parse("19540414");
        SimpleDateFormat sdf2 = new SimpleDateFormat("mm/dd/yyyy");

        System.out.println("sdf2.format(date) = " + sdf2.format(date));

    }
}
