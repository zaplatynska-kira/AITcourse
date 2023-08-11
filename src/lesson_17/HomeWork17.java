package lesson_17;

import java.util.Random;

public class HomeWork17 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] newBarriers = new int[10];

        for (int i = 0; i < newBarriers.length; i++) {
            newBarriers[i] = random.nextInt(400);
        }

        Dog testDog = new Dog("Test Dog", random.nextInt(101));
        testDog.whoAmI();

//        int count = 0;
//
//        for (int barrier : newBarriers) {
//            System.out.println("Попытка перепрыгнуть барьер " + barrier);
//            if (testDog.getBarrier(barrier)) {
//                count++;
//            }
//            System.out.println("End attempt \n");
//        }
//        System.out.println("End for loop");
        int sucBarrierForDog = startTrainingForOneDog(testDog, newBarriers);


        System.out.println(testDog.name + " преодолела " + sucBarrierForDog + " барьеров");

        Dog[] dogs = new Dog[3];
        Dog[] dogs2 = {new Dog("Rax", 100), new Dog("Sharik", 56)};

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog("Dog" + (i+1), random.nextInt(151) );
            dogs[i].whoAmI();
        }

        System.out.println();
        System.out.println("==================");
        System.out.println("Start for loop for 3 dogs");

        for (Dog currentDog : dogs) {
            startTrainingForOneDog(currentDog, newBarriers);
        }


    }

    public static int startTrainingForOneDog(Dog dog, int[] barriers) {
        int count = 0;

        for (int barrier : barriers) {
            System.out.println("Попытка перепрыгнуть барьер " + barrier);
            if (dog.getBarrier(barrier)) {
                count++;
            }
            System.out.println("End attempt \n");
        }

        return count;
    }

}
