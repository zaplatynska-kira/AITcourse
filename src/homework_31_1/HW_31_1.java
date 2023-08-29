package homework_31_1;

public class HW_31_1 {
    public static void main(String[] args) {
        String string1 = "Hello World";
        String string2 = "l";
        String string3 = "HeLLo World";
        String string4 = "l";
        int count = countPattern(string1,string2);
        boolean areEqual = string1.equalsIgnoreCase(string2);
        System.out.println("количество вхождений паттерна в строку: "+ countPattern(string1,string2));
        System.out.println("количество вхождений паттерна в строку: "+ countPattern(string3,string4));
    }

    public static int countPattern(String str1, String str2) {
        int count = 0;
        int index = str1.lastIndexOf(str2);
        while (index != -1) {
            count++;
            index = str1.lastIndexOf(str2, index - 1);
        }
        return count;
    }
}


