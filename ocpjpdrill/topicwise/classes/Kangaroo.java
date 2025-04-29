package topicwise.classes;

public class Kangaroo {
    class Joey{
        int numJoeys = 0;
    }

    class JoeyStatic {
        static int numJoeys = 0;
    }

    Joey createJoey(){
        return new Joey();
    }

    void hop() {
        interface Hopper {
            enum Size { EXTRA_SMALL, SMALL }
        }
    }

    public static void main(String[] args) {
        Kangaroo k = new Kangaroo();
        Kangaroo.Joey joey = k.createJoey();
        System.out.println("Joey.numJoeys: " + joey.numJoeys);
    }
}
