package homework_37;

import java.util.ArrayList;
import java.util.List;

public class HW_37 {
    /*
    Написать метод, принимающий не пустой лист строк и возвращающий строку,
    которая встречается раньше в листе - самую короткую или самую длинную.
     Все строки в листе разной длины
     */
    public static String findString(List<String> strings1, boolean strings2) {
        if (strings1.isEmpty()) {
            return null;
        }
        String result = strings1.get(0);

        for (String str : strings1) {
            if (strings2) {
                if (str.length() < result.length()) {
                    result = str;
                }
            } else {
                if (str.length() > result.length()) {
                    result = str;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("AAAAAA");
        strings.add("Bbbbbbbb");
        strings.add("Ccc");
        strings.add("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");



        String str1 = findString(strings, true);
        System.out.println("Shot String: " + str1);


        String str2 = findString(strings, false);
        System.out.println("Long String: " + str2);
    }

}







