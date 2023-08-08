package Lesson_06_if;

import java.util.Random;
import java.util.Scanner;

public class LessonIF {
    public static void main(String[] args) {
        int x = 8;
// if (x<=10) System.out.println("Привет всем!");

        System.out.println("x before if: " + x);
        if (x == 10) {
            x = x - 1;
            System.out.println("x in if:" + x);

        }
        System.out.println("x after if:" + x);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число 1:");

        int userInputInt = scanner.nextInt();
        if (userInputInt == 1) {
            System.out.println("Вы ввели число 1:");
        } else if (userInputInt == 3) {
            System.out.println(" Вы ввели 3, а не 1");
        } else {

            System.out.println(" Вы ввели что-то непонятное ");
        }
        {
            /* ребенок принес оценкув школе, от 1 до 5
            у ребенка есть корманые деньги
            за хорошие оценки получает деньги, за плохие отбирает
            5-> +20
            4-> +10


             */
            Random random = new Random();
            int money = 100;
            int note = random.nextInt(5);

            if (note == 5) {
                money += 20;
            } else if (note == 4) {
                money = 10;
            } else if (note == 3) {

            } else if (note == 2) {
                money -= 20;
            } else if (note == 1) {
                money = 0;
            } else {
                System.out.println("получение не корректная оценка");
            }
            System.out.println(" У ребенка осталось: " + money + "монет");


        }

        int var1=10;
        int var2 =(var1 > 10) ? 20 : 0;
        System.out.println( "var2" + var2);

        if (var1 > 10) {
            var2 = 20;
        } else {
            var2= 0;

        }
    }
}












