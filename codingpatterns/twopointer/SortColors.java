package twopointer;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortColors {

    public static void main(String[] args) {
        // [ 1, 0, 2, 1, 2, 2 ]
//           ^  ^
        // [ 0, 1, 2, 1, 2, 2 ]
        //      ^  ^
        //   0 1
        Arrays.sort(args);
        int[] samp1 = {12, 34, 45, 23, 55};
        System.out.println("Original Array");
        System.out.println(samp1);
        System.out.println("Array Clone: ");
        int[] arrayClone = samp1.clone();
        System.out.println(arrayClone);
        System.out.println(samp1);
        System.out.println("(samp1 == arrayClone)");
        System.out.println((samp1 == arrayClone));

        System.out.println("(samp1.class == arrayClone.class)");
        System.out.println((samp1.getClass().equals(arrayClone.getClass())));

        System.out.println("Length: " + "1000".length());

        String sampSentence = "Hello   Friend";

        String sampSenArray[] = sampSentence.split(" ");
        String newSamArray[] = new String[sampSenArray.length];

        for(int i = 0, j = sampSenArray.length - 1; i < sampSenArray.length; i++, j-- ){
            newSamArray[j] = sampSenArray[i];
        }

        String outSamArray = Arrays.stream(newSamArray).filter(e -> e.length() > 0 ).collect(Collectors.joining(" "));

        System.out.println("Before: sampSentence = " + sampSentence);
        System.out.println("After: outSamArray = " + outSamArray);

        char[] sampSentenceChar = sampSentence.toCharArray();
        String cleanArray = cleanSpaces(sampSentenceChar, sampSentenceChar.length);
        System.out.println("cleanArray = " + cleanArray);

        //=============================
        System.out.println("===============================>>>>");
        String nameOfStr = "PETER";
        StringBuilder sb1 = new StringBuilder(nameOfStr );
        System.out.println("BEFORE-REVERSE: " + sb1);
        strRev(sb1, 0, nameOfStr.length() - 1);
        System.out.println("AFTER-REVERSE: " + sb1);


    }

    static String cleanSpaces(char[] a, int n){
        String str = new String(a, 0, n);
        System.out.println("str = " + str);
        str = str.replaceAll("\\s+", " ").trim();
        return str;
    }

    static String reverseWords(String s){
        char[] s1 = s.toCharArray();
        String s2 = cleanSpaces(s1, s1.length);
        StringBuilder stringBuilder = new StringBuilder(s2);
        strRev(stringBuilder, 0, stringBuilder.length() - 1);

        int n = stringBuilder.length();
        int start = 0, end = 0;

        while( start < n ){
            while( end < n && stringBuilder.charAt(end) != ' ')
                ++end;
        }

        return "";
    }

    private static void strRev(StringBuilder stringBuilder, int startRev, int endRev) {
        while(startRev < endRev){
            char temp = stringBuilder.charAt(startRev);
            stringBuilder.setCharAt(startRev++, stringBuilder.charAt(endRev) );
            stringBuilder.setCharAt(endRev--, temp);
        }
    }
}
