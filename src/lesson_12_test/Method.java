package lesson_12_test;

public class Method {
    public static void main(String[] args) {
        powIntMethod(2);
        int sum = powIntMethod(2);
        System.out.println(sum);
        System.out.println(powIntMethod(5));
    }

    public static int powIntMethod(int x){
        int result;
 result=x * x;
 return result;
    }
}
