package homework_05;

import java.util.Random;

public class Main_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int varRandom = random.nextInt(20);

        int var1 = random.nextInt(20);
        System.out.println("var " + var1);

        boolean b1 = (var1 % 2 == 0);
        System.out.println("chislo " + var1 + "chetnoe" + b1);

        boolean b2 = (var1 % 3 == 0);
        System.out.println("chislo " + var1 + "kratnoe 3" + b2);
        boolean b3 = (b1) & (b2);
        System.out.println("chislo" + var1 + "chetnoe" + b1 + "kratnoe 3" + b2 + "chetnoe i kratnoe" + b3);

    }
}
