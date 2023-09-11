package homework_40;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HW_40 {
    public static List<String> deleteDuplicates(List<String> names){
        Set<String>names1=new TreeSet<>(names);
        List<String>result=new ArrayList<>(names1);
        return result;
    }

    public static void main(String[] args) {

            List<String> names = new ArrayList<>();
            names.add("John");
            names.add("Jack");
            names.add("Anna");
            names.add("Bill");
            names.add("John");


            List<String> deleteDuplicates = deleteDuplicates(names);

            for (String name : deleteDuplicates) {
                System.out.println(name);
            }
        }
    }



