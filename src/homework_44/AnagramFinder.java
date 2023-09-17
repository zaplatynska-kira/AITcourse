package homework_44;
import java.util.*;
public class AnagramFinder {
    /*
    Пусть есть лист имен, где некоторые имена повторяются. Написать метод, принимающий этот лист и имя и
    возвращающий сколько раз встречается это имя в листе. В решении использовать мапу
    Пример: [John,John, Bill, Ann, Ann] -> 2
     */


    public int nameToNumberOccurence(List<String> names, String name) {
        Map<String, Integer> nameByNumber = new HashMap<>();

        for (String s : names) {
            if (nameByNumber.containsKey(s)) {
                nameByNumber.put(s, nameByNumber.get(s) + 1);
            } else {
                nameByNumber.put(s, 1);
            }
        }
        //  if(nameByNumber.containsKey(name))
        //      return nameByNumber.get(name);

        return nameByNumber.getOrDefault(name, 0);

    }

    /*
    3.Пусть есть лист имен и их анаграмм. Написать метод, принимающий этот лист  и имя, по которому он возвращает список
    всех его анаграмм, включая само имя
    [john, ann, bill, nan, nna, llbi, ohnj],ann -> [ann,nan,nna]
    List<String> findAnagrams( String str, List<String>strings).
    Решение с помощью мапы.

     */

    List<String> findAnagrams(String str, List<String> strings) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strings) {
            String sortedKey = sortAnagram(s);

            if (anagrams.containsKey(sortedKey)) {
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey, value);
            }
        }
        return anagrams.getOrDefault(sortAnagram(str), List.of());
    }

    private String sortAnagram(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
