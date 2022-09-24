class Permutation {
    
    public boolean checkInclusion(String s1, String s2) {
        
        /*
        *  s1: "ab"
        *  s2: "eidbaooo"
        *
        *  //sort s1:=> ab
        *  loop through s1 & check for any case where the currentCharacter starts in S2
        *  get the length of s1 from s2 substring and then sort that substring
        *  does it match with the sorted s1? if so return true otherwise return false
        */
        
        // first get a set of the characters to s1, then store it in a set in that order
        
        String[] s2Array = s2.split("");
        String[] s1Array = s1.split("");
        
        String s1Sorted = sortString(s1Array);
        
       // System.out.println("Sorted-String: " + s1Sorted );
        
        int s2Length = s2.length();
        int s1Length = s1.length();
        
        /*
            
            ab
            ^
             ^
             
        
        */
        
        for(int i = 0; i < s1Length; i++ ){ // loop through the short string
            // pick the first one and loop through the main list
            for(int j = 0; j < s2Length; j++){
              /*
                System.out.println("s1Sorted|: " + s1Sorted);
                System.out.println("s1Sorted.charAt(i)|: " + s1Sorted.charAt(i));
                System.out.println( "==========================================" );
            */    
                String sbS1 = Character.toString(s1Sorted.charAt(i));
                // System.out.println("sbS1.toString()==>>: " + sbS1 + "  s2Array[j]==>>: " + s2Array[j] );
                if( sbS1.toString().equals(s2Array[j]) && ( (j + s1Length) <= s2Length ) ) {
                    String tmpString = s2.substring(j, j + s1Length);
                    if(s1Sorted.equals(sortString(tmpString.split("")))){
                        return true;
                    }
                }
            }
        }
        
        
        
        
        return false;
        
    }
    
    static String sortString(String[] sArray){
        Arrays.sort(sArray);
        String sb = Arrays.stream(sArray).collect(Collectors.joining());
        return sb;
    }
    
    static String removeDuplicate(String inputStr){
        return inputStr;
    }
}
