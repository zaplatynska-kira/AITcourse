package homework_08_02;

public class HW0802 {
    public static void main(String[] args) {

        int a = 0;
        do {
            System.out.println("Number " + a++);
        } while (a <= 7 && a <= 100);
        if (a % 5 == 0) ;
        {
            System.out.println("7 чисел от 1 до 100, которые делятся на 5 без остатка : " + a);
        }
    }
}







