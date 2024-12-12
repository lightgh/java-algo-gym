package designpatterns.behavioural.strategy.accountsamp;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        JamiuAccount jamiuAccount = new JamiuAccount();

        List<AccountOpeningStrategy> accountOpeningStrategies = List.of(currentAccount, savingsAccount, jamiuAccount);

        accountOpeningStrategies.forEach(eachAccount -> {
            AccountOpeningContext accountOpeningContext = new AccountOpeningContext(eachAccount);
            accountOpeningContext.openAccount();
        });

    }
}
