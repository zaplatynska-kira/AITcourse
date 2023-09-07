package lesson_37;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Main {

        public static void main(String[] args) {

            List<String> numbers = new ArrayList<>();
            numbers.add("One");
            numbers.add("Two");
            numbers.add("Three");

            Iterator<String> iterator = numbers.iterator();

            while (iterator.hasNext()){
                String nextStr =  iterator.next();
                System.out.println(nextStr);

                if( nextStr.equals("One")) {
                    iterator.remove();
                }

            }

            System.out.println(numbers);


        }
    }

