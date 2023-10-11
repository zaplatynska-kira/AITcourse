package homework_60;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HW_2 {

    public static void main(String[] args) {
        List<String> names = List.of("Ann", "Bob", "Ann", "Kevin", "Bob", "David");

        Map<Boolean, List<String>> partitionedNames = removeDuplicates(names);
        System.out.println("Имена без повторений: " + partitionedNames.get(false));
    }

    public static Map<Boolean, List<String>> removeDuplicates(List<String> names) {
        return names.stream()
                .collect(Collectors.partitioningBy(
                        name -> names.indexOf(name) != names.lastIndexOf(name)
                ));
    }
}


