package homework_63;

import java.util.List;
public class Person {
    String name;
    List<BankAccount> accountList;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<BankAccount> accountList) {
        this.accountList = accountList;
    }

    @Override
    public String toString() {
        return name;
    }
}
