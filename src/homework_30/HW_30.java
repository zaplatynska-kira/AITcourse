package homework_30;

import java.util.Arrays;

public class HW_30 {


    public static void main(String[] args) {
        System.out.println(isAnagram("ABCD", "ADBC"));
        System.out.println(isAnagram("ABCD", "ADBC  "));
        System.out.println(isAnagram("ROSA", "ASOR"));
        System.out.println(isAnagram("abc", "nba"));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}

/*
2) Используя принципы отбрасывания констант и оставления только максимально
быстро растущего элемента найти асимптотики для следующих функций:

f(n) = 9n +73
f(n) = 235
f(n) = n^2 + 7n +123
f(n) = n^3 +2000n +8765
f(n) = n + sqrt(n)

РЕШЕНИЕ:
f(n) = 9n
f(n) = 1
f(n) = n^2
f(n) = n^3
f(n) = n


 */

