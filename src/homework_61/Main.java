package homework_61;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {


    /*
        Есть классы Person1  и BankAccount   нужно написать метод,
        принимающий  лист BankAccounts и возвращающий
     мапу  где Person1  будет ключом, а лист его\ ее счетов значением

         */





    public static Map<Person1, List<BankAccount>> mapAccountsToPerson(List<BankAccount> input){
        return input
                .stream()
                .collect(Collectors.groupingBy(BankAccount::getOwner));
    }


    /*
         2. Есть класс BankAccount. Нужно написать метод, принимающий лист BankAccounts и
    // возвращающий лист IBANNs со звездочкой после третьего символа
    // DE4****************,DE5*******************,

         */
    public static Map<Person1, List<String>> starAccountsToPerson(List<BankAccount> input) {
        return input.stream()
                .collect(Collectors.groupingBy(
                        BankAccount::getOwner,
                        Collectors.mapping(
                                bankAccount -> {
                                    String iban = bankAccount.getIBAN();
                                    int length = iban.length();
                                    return length >= 3 ? iban.substring(0, 3) + "*".repeat(length - 3) : iban;
                                },
                                Collectors.toList()
                        )
                ));
    }


    public static void main(String[] args) {
        Person1 person1 = new Person1("Ann");
        Person1 person2 = new Person1("Jack");
        Person1 person3 = new Person1("Bob");

        BankAccount bankAccount1 = new BankAccount("DE4444444444", person1);
        BankAccount bankAccount2 = new BankAccount("DE1111111111", person2);
        BankAccount bankAccount3 = new BankAccount("DE7777777777", person3);

        List<BankAccount> bankAccounts = Arrays.asList(bankAccount1, bankAccount2, bankAccount3);
        Map<Person1, List<BankAccount>> accountsMap = mapAccountsToPerson(bankAccounts);


        accountsMap.forEach((key, value) -> {
            System.out.print(key.getName() + " -> [");
            System.out.print(value.stream().map(BankAccount::getIBAN).collect(Collectors.joining(", ")));
            System.out.println("]");
        });

        System.out.println("******************************************************");
        List<BankAccount> bankAccounts1 = Arrays.asList(bankAccount1, bankAccount2, bankAccount3);
        Map<Person1, List<String>> accountsMap1 = starAccountsToPerson(bankAccounts1);

        accountsMap1.forEach((key, value) -> {
            System.out.print(key.getName() + " -> [");
            System.out.print(value.stream().collect(Collectors.joining(", ")));
            System.out.println("]");
        });


    }
}



