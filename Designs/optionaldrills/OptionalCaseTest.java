package optionaldrills;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalCaseTest {
    public static void main(String[] args) {
        List<TempCarObj> samplist = new ArrayList<>();
        samplist.add(new TempCarObj());

        samplist.forEach(eachV -> {
             Optional.ofNullable(eachV.getTempL().get(0));
        }
        );
    }


}
class TempCarObj {

    List<TempCarOBSamp> tempL = new ArrayList<>();

    public List<TempCarOBSamp> getTempL() {
        return tempL;
    }
}

class TempCarOBSamp {
}

class TempCarOBSampCont {
}