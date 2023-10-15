package homework_63;

import java.util.List;
import java.util.stream.Collectors;
public class HW63 {
    /*
    Пусть есть класс BankAccount  с полем  String IBAN   и класс Person c  полями name и List<BankAccount>.
        Нужно написать метод, который вернет список IBANs  с номерами замененными звездочкой после 3 третьего символа
     */
    public static void main(String[] args) {

        Person person1 = new Person("Kate");
        Person person2 = new Person("Ann");
        List<String> accounts1 = List.of("DE123445674321345699", "DE223445674321341234");
        List<String> accounts2 = List.of("DE323445674321345623", "DE423445674321345600");
        BankAccount account1 =new BankAccount("Ann",accounts1);
        BankAccount account2 =new BankAccount("Kate",accounts2);

        person2.setAccountList(List.of(account2));
        person1.setAccountList(List.of(account1));
        List<Person>persons=List.of(person2,person1);
        List<String> personIBANs = getListWithStars(persons);
        System.out.println(personIBANs);


    }

    public static List<String> getListWithStars(List<Person> input) {
        return input.stream()
                .flatMap(person -> person.getAccountList().stream())
                .flatMap(account -> account.getAccounts().stream())
                .map(account -> replaceWithStars(account))
                .collect(Collectors.toList());
    }

    private static String replaceWithStars(String input) {
        StringBuilder personIBAN = new StringBuilder(input);
        for (int i = 3; i < input.length(); i++)
           personIBAN.setCharAt(i, '*');
        return personIBAN.toString();
    }
    }

