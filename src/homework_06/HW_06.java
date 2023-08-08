package homework_06;

public class HW_06 {
    public static void main(String[] args) {

        int a = 7;
        int b = 15;
        int c = 35;
        int d = 98;

        if (a >= b && a >= c && a >= d) {
        System.out.println("max a"+ "=" +7); }
        else if (b >= a && b >= c && b >= d) {
            System.out.println("max b" + "=" + 15); }
        else if (c >= a && c >= b && c >= d) {
            System.out.println("max c" + "=" + 35); }
        else if (d >= a && d >= b && d >= c) {
            System.out.println("max d" +"="+ 98); }


    }
}