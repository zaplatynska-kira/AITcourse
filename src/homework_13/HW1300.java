package homework_13;

import java.sql.Array;
import java.util.Arrays;

public class HW1300 {
    public static void main(String[] args) {
      /*Task 0
      Написать метод по поиску строки в массиве строк.
      На вход метод принимает массив строк, и строку для поиска.
       */
        String[] array = {"ein", "zwei", "drei", "vier"};
        String str = "Vier";
        String str2 = "vier";
        System.out.println("Строка : "   + "результат  " +  findStringInArray(array, str));
        System.out.println("Строка : "   + "результат   " +  findStringInArray(array, str2)) ;
    }

    public static boolean findStringInArray(String[] array, String find) {
        boolean res = false;
        for (String str : array) {
            if (str.equals(find)) {
                res = true;
            }

        }
        return res;
    }

}
