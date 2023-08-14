package homework_20;

import java.util.Random;

public class MainDog {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Luna", 50);

        for (int i = 0; i < 7; i++) {
            dog1.training();
        }
        System.out.println("jumpHeight " + dog1.getJumpHeight());
        System.out.println("maxJumpHeight " + dog1.getMaxJumpHeight());
        Dog dog = new Dog("Rex" , 150);
        System.out.println(dog.getJumpHeight());
        System.out.println(dog.getMaxJumpHeight());
        int[] barriers = {120, 180, 160, 280, 350, 50};
        Random random = new Random();
        Dog testDog = new Dog("Arno", 53);
        testDog.whoAmI();
        System.out.println("max Jump = " + testDog.getMaxJumpHeight());
        testDog.whoAmI();
        testDog.getBarrier(112);
        System.out.println();
        int[] ints = {106, 112, 100, 120};
        for (int currentBarrier: ints) {
            testDog.getBarrier(currentBarrier);
            System.out.println("ВСЕГО СОБАК И ОБЩЕЕ КОЛЛИЧЕСТВО ПРЫЖКОВ ");
            System.out.println("Всего cобак: " + Dog.getNumberOfDogs());
            System.out.println("Суммарное количество прыжков собак: " + Dog.getTotalJumps ());
        }
    }
}
