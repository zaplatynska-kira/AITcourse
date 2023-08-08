package homework_1301;

public class HW1301 {
    public static void main(String[] args) {
      /*  Task 1

         Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки,
          переведенных в верхний регистр. Распечатать полученный результат в методе main
          "Hello" -> "EL"
          "He" -> "E"
          "H" -> ???
         */

        String str = "Hello";
        String str1 = "He";
        String str2 = "H";
        System.out.println(getNewString(str));
        System.out.println(getNewString1(str1));
        System.out.println(getNewString2(str2));
    }

    public static String getNewString(String str) {

        String result = str.substring(1, 3);
        result = result.toUpperCase();
        return result;

    }

    public static String getNewString1(String str) {

        String result = str.substring(1);
        result = result.toUpperCase();
        return result;
    }

    public static String getNewString2(String str) {
        String result = str.substring(0);
        result = result.toUpperCase();
        return result;

    }

}


