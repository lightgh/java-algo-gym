package educative;

public class Parlindrome {
    public static void main(String[] args) {
        String str="radarp"; //find the string is palindrome or not?
        System.out.printf("Is [%s] Palindrome? %s ", str, isParlindrome(str));

    }

    public static boolean isParlindrome(String str) {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
