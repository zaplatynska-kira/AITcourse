package homework1501;

public class Student {
    String name;
    String group;
    int age;


    public Student (int age, String name, String group){
        this.age = age;
        this.name = name;
        this.group = group;
    }

    public Student() {
    }

    void english () {
        System.out.println("I know english");
    }

    void programming() {
        System.out.println("I know Java");
    }

    void sport() {
        System.out.println("I play football !");
    }



}


