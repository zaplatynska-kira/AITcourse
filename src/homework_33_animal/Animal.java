package homework_33_animal;

public class Animal implements Comparable<Animal>{

    String animalname;
   int weight;
     String color;

    public Animal(String name, int weight, String color) {
        this.animalname = name;
        this.weight = weight;
        this.color = color;
    }

    public int compareTo(Animal animal){
       return  this.animalname.compareTo(animal.animalname);
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + animalname + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
