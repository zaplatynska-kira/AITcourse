package homework_09_00;


public class HW0900 {
    public static void main(String[] args) {
        int[] array = {6, 8, 3, 5, 1, 9};
int sum=(6+8+3+5+1+9);

        array[5] = 9;
        array[4] = 1;

        System.out.println("максимальное значение: " + array[5]);
        System.out.println(" минимальное значение: " + array[4]);
        System.out.println(" среднее арифметическое: " + sum /6);

    }
}

