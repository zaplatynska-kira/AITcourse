package homework_63;

import java.util.List;

public class BankAccount {
    private String name;
    private List<String> accounts;

    public BankAccount(String name, List<String> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public List<String> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
