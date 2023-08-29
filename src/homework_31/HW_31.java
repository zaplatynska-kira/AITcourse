package homework_31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW_31 {
    public static void main(String[] args) {
        String string1 = "Hello World";
        String string2 = "l";
        String string3 = "HeLLo World";
        String string4 = "l";
        boolean areEqual = string1.equalsIgnoreCase(string2);
        Integer count = countPattern(string1, string2);
        System.out.println("количество вхождений паттерна в строку: "+ countPattern(string1,string2));
        System.out.println("количество вхождений паттерна в строку: "+ countPattern(string3,string4));

    }

    public static Integer countPattern(String str1, String str2) {
        Pattern result = Pattern.compile(str2);
        Matcher matcher = result.matcher(str1);
        Integer count = 0;
        while ((matcher.find())) {
            count++;
        }
        return count;

    }
}















