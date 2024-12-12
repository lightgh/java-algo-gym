package designpatterns.behavioural.strategy.accountsamp;

public class SavingsAccount implements AccountOpeningStrategy{

    @Override
    public void openAccount() {
        System.out.println("Saving Account Opened");
    }

}
