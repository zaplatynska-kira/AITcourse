package homework_33_animal;

import java.util.Comparator;

public class LastLetterNameComparator implements Comparator<Animal> {

    public int compare(Animal a1, Animal a2) {
        String name1 = a1.animalname;
        String name2 = a2.animalname;
        char lastLetter1 = name1.charAt(name1.length() - 1);
        char lastLetter2 = name2.charAt(name2.length() - 1);

        if (lastLetter1 < lastLetter2) {
            return -1;
        } else if (lastLetter1 > lastLetter2) {
            return 1;
        } else {
            return 0;
        }
      //  return Integer.compare(a1.animalname,a2.animalname);
    }


    }






