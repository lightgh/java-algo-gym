package optionaldrills;

public class InterfaceUsageDrill {
    public static void main(String[] args) {
        InterfaceUsageSample.seekMe();
//        InterfaceUsageSampleImpl intUSImpl = new InterfaceUsageSampleImpl();
        InterfaceUsageSample intUSImpl = (a) -> a.toUpperCase();

  /*
          InterfaceUsageSample intUSImpl = new InterfaceUsageSample(){
            @Override
            public String processInput(String input1){
                return input1.toUpperCase();
            }

            public String processInput2(String input2){
                return input2.toLowerCase();
            }
        };
*/

        intUSImpl.readInput();
        String outcome = intUSImpl.processInput("naming string processing");
//        String outcome1 = intUSImpl.processInput2("naming string processing");
        System.out.println("outcome:processInput = " + outcome);

    }
}

class InterfaceUsageSampleImpl implements InterfaceUsageSample{
    @Override
    public String processInput(String input1){
        return input1.toUpperCase();
    }

    public String processInput2(String input2){
        return input2.toLowerCase();
    }
}
