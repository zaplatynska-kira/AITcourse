package homework_60;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    /*
    Есть класс Address с полями String street и int houseNumber и класс Person
с полями String name, int age , Address address.
Написать метод,принимающий лист Persons и возвращающий лист адресов тех из них, кто старше 17 лет
     */
     /*
    Написать метод, принимающий список Person (из задачи 1) и возвращающий мапу,
     где возраст является ключом, а лист людей этого возраста значением
     */


    public static void main(String[] args) {
        Address address1 = new Address("Street1", 1);
        Address address2 = new Address("Street2", 2);
        Address address3 = new Address("Street3", 3);
        Address address4 = new Address("Street4", 4);

        Person person1 = new Person("Person1", 16, address1);
        Person person2 = new Person("Person2", 35, address2);
        Person person3 = new Person("Person3", 46, address3);
        Person person4 = new Person("Person4", 6, address4);

        List<Person> list = Arrays.asList(person1, person2, person3, person4);

        List<Address> addresses = getAddresses(list);
        addresses.forEach(a -> System.out.println(a.toString()));
        System.out.println( "---------------------------------------------");
        Map<Integer, List<Person>> ageToPersonsMap = mapAddresses(list);
        ageToPersonsMap.forEach((age, persons) -> {
            System.out.println("Возраст: " + age);
            persons.forEach(person -> System.out.println("  - " + person.getName()));
        });
    }



    public static List<Address> getAddresses (List < Person > input) {
            return input.stream()
                    .filter(person -> person.getAge() > 17)
                    .map(Person::getAddress)
                    .collect(Collectors.toList());
        }

    public static Map<Integer, List<Person>> mapAddresses(List<Person> input) {
        return input.stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }
    }

