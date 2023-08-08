package homework_08_04;

import java.util.Scanner;

public class HW0804 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nummer = 567432;
        int sum = 0;
        System.out.print("Geben Sie eine Nummer: ");
        int userInput = input.nextInt();

        do {
            sum += nummer % 10;
            nummer /= 10;
        }
        while (nummer > 0);
        System.out.print("die Summe 567432: " + sum);

    }
}
