import java.util.*;
import java.math.BigDecimal;

public class Comparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s1 = { "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000" };

        // int n = in.nextInt();
        int n = s1.length;

        String s2[] = new String[n];
        /*
         * for (int i = 0; i < n; i++) { s2[i] = in.next(); }
         */
        in.close();

        Arrays.sort(s1, 0, n, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                BigDecimal _a = new BigDecimal(a);
                BigDecimal _b = new BigDecimal(b);
                return _a.compareTo(_b);
            }
        }));

        for (int i = 0; i < n; i++) {
            System.out.println(s1[i]);
        }
    }
}