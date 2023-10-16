package homework_64;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Написать метод, находящий сумму всех значений заданного подмассива двумерного массива целых чисел.
      public int findSumOfNsubArray( int[][]ints, int n)


      2. Написать метод, принимающий двумерный массив целых чисел и  выводящий на экран номер строки (подмассива),
        сумма всех элементов которого рана нулю
        int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}} -> 0,1
       3.
        Написать метод, принимающий двумерный массив и возвращающий количество строк( подмассивов), в которых
     нет отрицательных элементов
     int[][] table = { {1,4,5},{-1,-1,-1,2,1},{-1,10}} -> 1
     */


    public static void main(String[] args) {
//1.Написать метод, находящий сумму всех значений заданного подмассива n
// двумерного массива целых чисел.

        int[][] table = {{1, 4, -5}, {-1, -1, -1, 2, 1}, {-1, 10}};
        System.out.println("Sum of 2 subarray " + findSumOfNsubArray(table, 2));


       /* 2. Написать метод, принимающий двумерный массив целых чисел и  выводящий на экран номер строки (подмассива),
                сумма всех элементов которого рана нулю
        int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}} -> 0,1

        */

        int[][] tableZero = {{1, 4, -5}, {-1, -1, -1, 2, 1}, {-1, 10}};
        List<Integer> numWithZeroSum = findSumZero(tableZero);
        System.out.println("Sum  found " + numWithZeroSum);


    /*
    3.
        Написать метод, принимающий двумерный массив и возвращающий количество строк( подмассивов), в которых
     нет отрицательных элементов
     int[][] table = { {1,4,5},{-1,-1,-1,2,1},{-1,10}} -> 1
     */

        int[][] tableMinus = {{1, 4, 5}, {-1, -1, -1, 2, 1}, {-1, 10}};
        int count = findMinus(tableMinus);
        System.out.println("Number of rows without negative elements: "+ count);

    }


    public static int findSumOfNsubArray(int[][] ints, int n) {

        int sum = 0;

        for (int i = 0; i < ints[n].length; i++) {

            sum += ints[n][i];
        }
        return sum;
    }

    public static List<Integer> findSumZero(int[][] ints) {
        List<Integer> numWithZeroSum = new ArrayList<>();

        for (int i = 0; i < ints.length; i++) {
            int sum = 0;
            for (int j = 0; j < ints[i].length; j++) {
                sum += ints[i][j];
            }
            if (sum == 0) {
                numWithZeroSum.add(i);
            }
        }

        return numWithZeroSum;
    }


    public static int findMinus(int[][] ints) {
         {
            int count = 0;

            for (int i = 0; i < ints.length; i++) {
                boolean hasNegatives = false;
                for (int j = 0; j < ints[i].length; j++) {
                    if (ints[i][j] < 0) {
                        hasNegatives = true;
                        break;
                    }
                }
                if (!hasNegatives) {
                    count++;
                }
            }

            return count;
        }

    }

    }





