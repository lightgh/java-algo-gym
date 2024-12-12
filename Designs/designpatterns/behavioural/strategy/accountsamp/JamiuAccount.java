package designpatterns.behavioural.strategy.accountsamp;

public class JamiuAccount implements AccountOpeningStrategy{
    @Override
    public void openAccount() {
        System.out.println("Jamiu Type Account Opened");
    }
}
