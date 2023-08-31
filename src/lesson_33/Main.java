package lesson_33;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Интерфейс Comparable.
        /*
        Используется для сравнения однотипных обьектов и позволяет сортировать обьекты в соответствии с определенным
        порядком. Для этой цели нужно переопределить единственный метод интерфейса compareTo()
        int compareTo( Object o1)
        Метод сравнивает обьект, на котором он вызывается со вторым обьектом. Результат его работы - целое число,
        которое :
        - больше нуля если первый обьект больше второго
        - меньше нуля если меньше
        - равно нулю если обьекты равны

        Сравнение происходит по отдельным полям. Т.е. необходимо принять решение какое поле класса будет участвовать
        в определении порядка сортировки обьектов. Такой порядок будет называться естественным порядком сортировки
         */

        int[] ints = {45,2,15,0,5};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        String[] names = {"John", "Jack","Ann","Bill"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Player player1 = new Player(3,"Jack",21);
        Player player2 = new Player(1,"Steve",19);
        Player player3 = new Player(2,"Alex",24);

        Player[] team = {player1,player2,player3};
        System.out.println(Arrays.toString(team));
        Arrays.sort(team);
        System.out.println(Arrays.toString(team));



    }
    }

