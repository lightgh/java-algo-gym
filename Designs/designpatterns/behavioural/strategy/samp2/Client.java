package designpatterns.behavioural.strategy.samp2;

public class Client {

    private int[] numbers = new int[1000];

    public void determineAirAmoury() {
        AirToAirWeapon airToAirWeapon = new AirToAirWeapon();
        Context context = new Context(airToAirWeapon);
        context.arm(numbers);
    }
}
