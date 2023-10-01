package homework_54;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HW_54 {
    /*

    4. Пусть есть класс Person c полями name  и age. Нужно написать метод, записывающий в файл обьекты
      класса Person в виде строк и одновременно выводящий их на экран

     */

        public static void writePersons(List<Person> persons, String fileName) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                for (Person person : persons) {
                    String personString = person.toString();
                    writer.write(personString);
                    writer.newLine();
                    System.out.println(personString);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            List<Person> persons = List.of(
                    new Person("Peter", 35),
                    new Person("Simon", 5),
                    new Person("John", 90)
        );


         String fileName = "persons.txt";
          writePersons(persons, fileName );
        }
    }
