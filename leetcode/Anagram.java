package leetcode.solutionpack;
import java.util.Arrays;

//Leetcode Day2
public class Anagram {
    public boolean isAnagram(String s, String t) {
        String[] fString = s.split("");
        String[] sString = t.split("");
        
        Arrays.sort(fString);
        Arrays.sort(sString);
        
        int sLength = s.length();
        int tLength = t.length();
        
        if(sLength != tLength){
            return false;
        }
        
        for(int i = 0; i < sLength; i++){
            if(!fString[i].equals(sString[i])){
                return false;
            }
        }
        
        return true;
    }
}
