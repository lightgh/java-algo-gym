package datastructures.arraychallenges;

import java.util.Scanner;
import java.util.function.Function;

public class SearchingChallenge {

    String CountLetterInWord(String str) {
        int count = 0, temp = 0;
        String[] listOfWords = str.split(" ");
        String word = listOfWords[0];

        for(int i = 0; i < listOfWords.length; i++) {
            for(int j = 0; j < listOfWords[i].length(); j++) {
                temp = 0;
                for(int k = 0; k < listOfWords[i].length(); k++) {
                    if(listOfWords[i].charAt(j) == listOfWords[i].charAt(k)) {
                        temp++;
                    }
                }
                if(count < temp) {
                    count = temp;
                    word = listOfWords[i];
                    temp = 0;
                }
            }
        }

        if(count == 1){
            return "-1";
        }

        str = word;
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        SearchingChallenge c = new SearchingChallenge();
        System.out.print(c.CountLetterInWord(s.nextLine()));
    }

}
