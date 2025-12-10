import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();

        // asdbabbb
        // s
        System.out.println(getNonrepeatable(inputStr));

    }

    static String getNonrepeatable(String val){
        Map<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
        for(char c : val.toCharArray()){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c) + 1);
            }else{
                charCountMap.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey().toString();
            }
        }
        return "";
    }
}
