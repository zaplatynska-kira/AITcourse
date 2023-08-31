package homework_33_animal;

import java.util.Arrays;

public  class AnimalMain {

    /*
    Создать класс Animal c полями name, weight, color.
    Используя компараторы вывести на экран список животных, упорядоченный по:
    1. имени
    2. по весу
    3. список имен животных, упорядоченный по возрастанию последней буквы имени/*

     */

    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat", 5, "black-white");
        Animal animal2 = new Animal("Fox", 3, "foxy");
        Animal animal3 = new Animal("Bear", 200, "brown");
        Animal animal4 = new Animal("Dove", 1, "white");
        Animal[] animals = {animal1, animal2, animal3, animal4};

        System.out.println(" Sort by animals name:");
        Arrays.sort(animals);
        for (Animal animal : animals)
            System.out.println(animal);


        System.out.println();
        System.out.println(" Sort by  animals weight:");
        Arrays.sort(animals,new WeghtComparator());
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println();
        System.out.println(" Sort by  last letter animals name:");
        Arrays.sort(animals,new LastLetterNameComparator());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}



