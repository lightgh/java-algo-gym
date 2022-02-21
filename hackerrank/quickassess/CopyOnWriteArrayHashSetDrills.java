package quickassess;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayHashSetDrills {
    public static void main(String[] args) {
        List<String> playersList = new CopyOnWriteArrayList<>();

        playersList.add("Simi");
        playersList.add("Kingsley");
        playersList.add("Peterson");
        playersList.add("Hipman");
        playersList.add("Jones");

        Iterator<String> playerItr = playersList.iterator();

        while (playerItr.hasNext()) {
            String tmpName = playerItr.next();
            System.out.println("tmpName = " + tmpName);
            playersList.remove(tmpName);
        }

        HashSet<Integer> integerHashSet = new HashSet<>();

        System.out.println("integerHashSet.add(45) = " + integerHashSet.add(45));
        System.out.println("integerHashSet.add(4) = " + integerHashSet.add(4));
        System.out.println("integerHashSet.add(45) = " + integerHashSet.add(45));

        System.out.println(integerHashSet);

        System.out.println("integerHashSet.contains(45) = " + integerHashSet.contains(45));
        System.out.println("integerHashSet.contains(455) = " + integerHashSet.contains(455));
    }
}
