package designpatterns.behavioural.strategy.accountsamp;

public class CurrentAccount implements AccountOpeningStrategy{
    @Override
    public void openAccount() {

        System.out.println("Current Account Opened");
    }
}
