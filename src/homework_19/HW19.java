package homework_19;

import java.util.Random;

public class HW19 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Luna");
        dog.setJumpHeight(100);
        System.out.println("Я собака меня зовут " + dog.getName());
        System.out.println("Я умею прыгать на высоту " + dog.getJumpHeight()+ " см");

    }
}

