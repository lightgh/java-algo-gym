package educative;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

public class SumOfThree2 {
    public static void main(String[] args) {
        Set<Long> sets = Set.of(1L, 2L, 3L);
        Long[] longs = sets.toArray(new Long[0]);
        System.out.println(longs.length);
        for (Long aLong : longs) {
            System.out.println(aLong);
        }

        List<String> statuses = List.of("PENDING", "SHIPPED", "CANCELLED");
        StringJoiner sj = new StringJoiner(", ", "SELECT * FROM orders WHERE status IN (", ")");
        for (int i = 0; i < statuses.size(); i++) {
            sj.add(":status" + i);  // Add placeholders
        }

        System.out.println(sj);


    }


}
