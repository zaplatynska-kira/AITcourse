package lesson_17;

import java.util.Random;

public class MainDog {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Barbos", 50);

        for (int i = 0; i < 7; i++) {
            dog1.training();
        }

        System.out.println("=============");
        System.out.println("jumpHeight " + dog1.jumpHeight);
        System.out.println("maxJumpHeight " + dog1.maxJumpHeight);

        System.out.println("=========== Rax =============");
        Dog dog = new Dog("Rax", 150);

        System.out.println(dog.jumpHeight);
        System.out.println(dog.maxJumpHeight);

//        int barrier = 120;
//        dog.getBarrier(barrier);
//
//        barrier = 180;
//        dog.getBarrier(barrier);


        /*
        Повторить код класса Dog, написанного на уроке. Создать массив из 10 препятствий.
        Попросить объект класса собака перепрыгнуть все препятствия в массиве.
        Посчитать сколько препятствий из массива собака смогла преодолеть.
         */

        int[] barriers = {120, 180, 160, 280, 350, 50};

        Random random = new Random();



//        for (int barrier: newBarriers) {
//            dog.getBarrier(barrier);
//        }

        Dog testDog = new Dog("Test", 53);
        testDog.whoAmI();
        System.out.println("max Jump = " + testDog.maxJumpHeight);

//        testDog.jumpHeight = 98;
        testDog.whoAmI();


        testDog.getBarrier(112);

        System.out.println();
        System.out.println("Array training =======================");
        int[] ints = {106, 112, 100, 120};

        for (int currentBarrier : ints) {
            testDog.getBarrier(currentBarrier);
        }




    }
}
