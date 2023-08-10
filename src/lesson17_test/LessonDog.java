package lesson17_test;

import homework_15.Dog;

public class LessonDog {
    public static void main(String[] args) {
        DogTest dog = new DogTest( "Rex   ",  100, 120);
        dog.myName();
        dog.training();


        System.out.println( "Высота прыжка стала: " + dog.jumpHeight );

    }
}
