package homework_49;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class HW_49 {

    /*
    Написать метод, принимающий упорядоченный лист положительных целых чисел и целое число N и проверяющий есть ли в этом листе
    такие 2 числа что их произведение равно N. Метод в этом случае возвращает true иначе false
    {2,5,18,70}, 36 -> true
    {2,5,18,70}, 40 -> false

    {37, 38,48,23}, 36 -> false



     */


    public boolean multiply(List<Integer> list, int n) {
        if (list.get(0) > n) {
            return false;
        }

        Deque<Integer> result = new ArrayDeque<>();
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            while (left < right) {
                int num = list.get(left) * list.get(right);

                if (num == n) {
                    return true;
                } else if (num < n) {
                    left++;
                } else {
                    right--;
                }
            }
            return false;

        }
        return false;
    }

    public static void main(String[] args) {
        HW_49 hw49= new HW_49();
        List<Integer> list1= Arrays.asList(2,5,18,70 );

        int n=36;
        int n1=40;
        System.out.println(hw49.multiply(list1,n));
        System.out.println(hw49.multiply(list1,n1));
    }
}
