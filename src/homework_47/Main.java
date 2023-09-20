package homework_47;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        try {
            num2 = 40;
            num1 = 0;
            int divide = num2 / num1;
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getClass().getName() + " - " + e.getMessage());


        }

        String s;
        String m;

        try {
            s = null;
            m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred : " + e.getClass().getName() + " - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred");
            System.out.println(e.getMessage());
        }

        int[] m1 = new int[2];
        try {
            m1[8]=5;

        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred : " + e.getClass().getName() + " - " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Exception occurred");
            System.out.println(e.getMessage());

    }
}
}
