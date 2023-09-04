package homework_35;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        return a1.getWeight() - a2.getWeight();
    }
}
