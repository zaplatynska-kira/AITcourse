package homework_36;

import java.util.ArrayList;
import java.util.List;

public class HW_36_1 {
    /*
    Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes или No, где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать
     */
    public static void main(String[] args) {

        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        System.out.print("List №1: " + num1);
        System.out.println();
        num2.add(5);
        num2.add(2);
        num2.add(3);
        num2.add(8);
        System.out.print("List №2:  " + num2);
        System.out.println();
        System.out.println("List №1 size: " + num1.size());
        System.out.println("List №2 size: " + num2.size());

        List<String> result1 = new ArrayList<>();

        int size = num1.size();
        if (size != num2.size()) {
        }

        for (int i = 0; i < size; i++) {
            if (num1.get(i).equals(num2.get(i))) {
                result1.add("Yes");
            } else {
                result1.add("No");
            }
        }
        for (String value : result1) {
            if (value.equals("Yes")) {
                System.out.print("Yes ");
            } else {
                System.out.print("No ");
            }
        }

    }
}












