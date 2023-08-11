package lesson_18;

import java.util.Arrays;

public class Lesson_18 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();


        ra.printArray();
        System.out.println("Min " + ra.min());

        ra.add(10);
        ra.add(25);
        ra.add(-20);

        ra.printArray();

        int raSize = ra.size();
        System.out.println("Сейчас в массиве " + raSize + " элементов");

        System.out.println("Сумма знаний элементов массива " + ra.sumOfValues());

        ra.add(7, 14, -21);

        ra.printArray();

        System.out.println("Min в массиве: " + ra.min());
        System.out.println("Max в массиве: " + ra.max());

        int[] newArray = ra.toArray();

        newArray[0] = 10_000;
        System.out.println(Arrays.toString(newArray));

        ra.printArray();

        ra.deleteByIndex(5);
        ra.printArray();


    }
}
