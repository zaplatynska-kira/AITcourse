package homework_45;

import java.util.HashMap;
import java.util.Map;

public class HW_45 {
    /*
    Написать метод, принимающий не пустой лист целых чисел , в котором все числа кроме одного имеют пару и возвращающий это не парное число. При решении использовать мапу
Примеры:
1,3,1 -> 3
3,3,3 -> 3
1,1,15,1,1 -> 15
1,8,8,8,8,8,1,2,2 -> 8
     */
    public int findNumber(int[] ints){
        Map<Integer, Integer> occurencesByNumber = new HashMap<>();

        for (int i : ints) {
            int res = occurencesByNumber.merge(i, 1, (oldValue, newValue) -> oldValue + 1);

        }
        for (Map.Entry<Integer, Integer> entry : occurencesByNumber.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        HW_45 hw45 = new HW_45();
        int[] num1 = {1, 15, 1, 1, 1};
        int[] num2 = {1,8,8,8,8,8,1,2,2};
        int[] num3 = {3,3,3};
        int result1 = hw45.findNumber(num1);
        int result2 = hw45.findNumber(num2);
        int result3 = hw45.findNumber(num3);
        System.out.println("find non pair Number: " + result1);
        System.out.println("find non pair Number: " + result2);
        System.out.println("find non pair Number: " + result3);

    }
}
