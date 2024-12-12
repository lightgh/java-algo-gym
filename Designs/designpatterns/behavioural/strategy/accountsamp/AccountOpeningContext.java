package designpatterns.behavioural.strategy.accountsamp;

public class AccountOpeningContext {

    private AccountOpeningStrategy account;

    public AccountOpeningContext(AccountOpeningStrategy account){
        this.account = account;
    }

    public void openAccount(){
        this.account.openAccount();
    }

}
