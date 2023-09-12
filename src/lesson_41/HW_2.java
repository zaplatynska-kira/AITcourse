package lesson_41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW_2 {


        public static List<String> findDuplicates(List<String> names) {
            Set<String> uniqueNames = new HashSet<>();
            List<String> duplicatesList = new ArrayList<>();

            for (String name : names) {
                if (!uniqueNames.add(name)) {
                    // Если не удалось добавить в uniqueNames, значит это дубликат
                    duplicatesList.add(name);
                }
            }

            return duplicatesList;
        }

        public static void main(String[] args) {
            List<String> names = new ArrayList<>();
            names.add("John");
            names.add("Jack");
            names.add("Anna");
            names.add("Bill");
            names.add("John");
            names.add("Bill");

            List<String> duplicatesList = findDuplicates(names);

            for (String name : duplicatesList) {
                System.out.println(name);
            }
        }
    }


