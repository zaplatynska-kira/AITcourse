package homework_33_animal;

import java.util.Comparator;

public class WeghtComparator implements Comparator<Animal> {

    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.weight,a2.weight);


    }
}
