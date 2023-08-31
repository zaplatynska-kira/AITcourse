package homework_33_animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeghtComparatorTest {

    Animal animal1 = new Animal("Cat", 5, "black-white");
    Animal animal2 = new Animal("Fox", 3, "foxy");
    Animal animal3 = new Animal("Bear", 200, "brown");
    Animal animal4 = new Animal("Dove", 1, "white");
    Animal[] animals = {animal1, animal2, animal3, animal4};
@Test
    void testCompareTo() {
        assertTrue(animal1.compareTo(animal2) < 0);
    }
@Test
    void testCompareToFalse() {
        assertFalse(animal1.compareTo(animal2) > 0);

    }
}