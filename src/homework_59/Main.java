package homework_59;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*
        Есть класс Address с полями String street и int houseNumber и класс Person
с полями String name, int age , Address address.
Написать метод,принимающий лист Persons и печатающий адреса тех из них, кто старше 17 лет
         */

        Stream<Person> persons = Stream.of(
                new Person("John", 16, new Address("Big street", 1)),
                new Person("Ann", 46, new Address("Big street", 11)),
                new Person("Mari", 66, new Address("Small street", 2)),
                new Person("Jack", 45, new Address("Oxford street", 15))
        );

        persons.filter(person -> person.getAge() > 17)
                .map(person -> person.getAddress().getStreet() + ", " + person.getAddress().getHouseNumber())
                .forEach(System.out::println);
    }




}



