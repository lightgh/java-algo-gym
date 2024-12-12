package designpatterns.behavioural.strategy.samp2;

public class Context {
    ArmingStrategy armingStrategy;

    public Context(ArmingStrategy armingStrategy){
        this.armingStrategy = armingStrategy;
    }

    public void setArmingStrategy(ArmingStrategy armingStrategy){
        this.armingStrategy = armingStrategy;
    }

    public void arm(int[] inputs){
        this.armingStrategy.arm(inputs);
    }
}
